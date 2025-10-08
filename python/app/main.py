import os
from fastapi import FastAPI
from app.api import procuracao
from fastapi.middleware.cors import CORSMiddleware
from dotenv import load_dotenv

# Carrega as variáveis de ambiente do arquivo .env
load_dotenv()

app = FastAPI()

# Lê a variável de ambiente e a transforma em uma lista de origens
allowed_origins_str = os.getenv("ALLOWED_ORIGINS", "")
allowed_origins = [origin.strip() for origin in allowed_origins_str.split(',') if origin]

# Se a lista estiver vazia (para segurança), adicione um valor padrão ou lance um erro
if not allowed_origins:
    # Opção 1: Usar uma lista padrão segura
    # allowed_origins = ["https://campeaonautica.com.br"] 
    # Opção 2 (recomendada): Lançar um erro se a variável não estiver definida
    raise ValueError("A variável de ambiente ALLOWED_ORIGINS não está definida ou está vazia.")


app.add_middleware(
    CORSMiddleware,
    allow_origins=allowed_origins, # Utiliza a lista carregada do .env
    allow_credentials=True,
    allow_methods=["*"],
    allow_headers=["*"],
)

app.include_router(procuracao.router)