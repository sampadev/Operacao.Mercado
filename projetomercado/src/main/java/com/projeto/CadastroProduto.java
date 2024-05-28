package com.projeto;

import java.util.ArrayList;

public class CadastroProduto {

    private ArrayList<Produto> produtos = new ArrayList<>();

    public void novoProduto(Produto novoProduto) {
        produtos.add(novoProduto);
        for (Produto prod : produtos) {
            System.out.println("Produto: " + prod.getProduto());
            System.out.println("Valor: " + prod.getPreco());
            System.out.println("Quantidade: " + prod.getQuantidade());
        }
    }

    public void removerProduto(int posicao) {
        if (posicao >= 1 && posicao <= produtos.size()) {
            produtos.remove(posicao - 1);
        } else {
            System.out.println("Posição inválida para remover produto!");
        }
    }

    public void alterarProduto(int posicao, String nome, double preco, int quantidade) {
        Produto produto = obterProduto(posicao);
        produto.setNome(nome);
        produto.setPreco(preco);
        produto.setQuantidade(quantidade);
    }

    public void listarProdutos() {
        for (int i = 0; i < produtos.size(); i++) {
            Produto produto = produtos.get(i);
            System.out.println((i + 1) + ". Produto: " + produto.getProduto());
            System.out.println("Valor: " + produto.getPreco());
            System.out.println("Quantidade: " + produto.getQuantidade());
            System.out.println("----------------------");
        }
    }

    public Produto obterProduto(int posicao) {
        if (posicao < 1 || posicao > produtos.size()) {
            throw new IllegalArgumentException("Posição inválida para produto!");
        }
        return produtos.get(posicao - 1);
    }
}
