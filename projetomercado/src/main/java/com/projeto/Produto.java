package com.projeto;

public class Produto {
    private String produto;
    private int quantidade;
    private double preco;

    public Produto(String produto, int quantidade, double preco) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.preco = preco;
    }
    
    public String getProduto() {
        return produto;
    }

    public void setNome(String novoProduto) {
        this.produto = novoProduto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int novaQuantidade) {
        this.quantidade = novaQuantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double novoPreco) {
        this.preco = novoPreco;
    }
    

}
