package com.projeto;

public class ItemCarrinho {
    private String nomeProduto;
    private int quantidade;
    private double precoUnitario;
    private double valorTotal;

    public ItemCarrinho(String nomeProduto, int quantidade, double precoUnitario) {
        this.nomeProduto = nomeProduto;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
        this.valorTotal = this.quantidade * this.precoUnitario;
    }
    public String getNome() {
        return nomeProduto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public double getValorTotal() {
        return valorTotal;
    }
    public void setNome(String novoNome) {
        this.nomeProduto = novoNome;
    }

    public void setQuantidade(int novaQuantidade) {
        this.quantidade = novaQuantidade;
        this.valorTotal = this.quantidade * this.precoUnitario;
    }

    public void setPrecoUnitario(double novoPrecoUnitario) {
        this.precoUnitario = novoPrecoUnitario;
        this.valorTotal = this.quantidade * this.precoUnitario;
    }
}
