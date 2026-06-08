package com.microservico.estoquepreco.dto;

public class PrecoDto {

    private String codigoproduto;
    private double preco;

    public PrecoDto() {
    }

    public String getCodigoproduto() {
        return codigoproduto;
    }

    public void setCodigoproduto(String codigoproduto) {
        this.codigoproduto = codigoproduto;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}