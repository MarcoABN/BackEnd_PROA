package com.proa.dto;

public class ProcuracaoRequestDTO {
    private Long idCliente;
    private Long idEmbarcacao;

    // Getters e Setters
    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public Long getIdEmbarcacao() {
        return idEmbarcacao;
    }

    public void setIdEmbarcacao(Long idEmbarcacao) {
        this.idEmbarcacao = idEmbarcacao;
    }
}
