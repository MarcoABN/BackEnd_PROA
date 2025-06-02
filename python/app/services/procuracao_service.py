from app.services.backend_service import obter_dados_cliente, obter_dados_embarcacao
from app.utils.procuracao01 import gerar_pdf_procuracao
from app.models.procuracao_model import ProcuracaoRequest


def gerar_procuracao(request: ProcuracaoRequest):
    print ('Iniciou a entrada no service python')
    cliente = obter_dados_cliente(request.idCliente)
    print ('chamou o cliente')
    embarcacao = obter_dados_embarcacao(request.idEmbarcacao)
    print ('chamou a embarcação')
    return gerar_pdf_procuracao(cliente, embarcacao)
