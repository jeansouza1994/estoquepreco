package com.microservico.estoquepreco.dto;

public class EstoqueDto {

    private String codigoproduto;
    private int quantidade;

    public EstoqueDto() {
    }

    public String getCodigoproduto() {
        return codigoproduto;
    }

    public void setCodigoproduto(String codigoproduto) {
        this.codigoproduto = codigoproduto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}