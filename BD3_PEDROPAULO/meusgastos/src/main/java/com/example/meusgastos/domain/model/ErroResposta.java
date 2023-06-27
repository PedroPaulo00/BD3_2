package com.example.meusgastos.domain.model;

public class ErroResposta{
    private String dataHora;
    private Integer status;
    private String titulo;
    private String mensagem;
    
    public ErroResposta(String dataHora, Integer status, String titulo, String mensagem) {
        this.dataHora = dataHora;
        this.status = status;
        this.titulo = titulo;
        this.mensagem = mensagem;
    }
    public String getDataHora() {
        return dataHora;
    }
    public Integer getStatus() {
        return status;
    }
    public String getTitulo() {
        return titulo;
    }
    public String getMensagem() {
        return mensagem;
    }
}
