package com.projeto;

import java.util.ArrayList;

public class OperacaoMercado {
    private ArrayList<ItemCarrinho> carrinho = new ArrayList<>();
    private CadastroProduto cadastroProduto;
    private Pedido pedido = new Pedido();

    public OperacaoMercado(CadastroProduto cadastroProduto) {
        this.cadastroProduto = cadastroProduto;
    }

    public void adicionarProdutoCarrinho(int posicao, int quantidadeDesejada) {
        try {
            Produto produto = cadastroProduto.obterProduto(posicao);
            int quantidadeEstoque = produto.getQuantidade();
            if (quantidadeEstoque > 0 && quantidadeDesejada <= quantidadeEstoque) {
                produto.setQuantidade(quantidadeEstoque - quantidadeDesejada);
                String produtoCarrinho = produto.getProduto();
                Double precoProduto = produto.getPreco();
                ItemCarrinho itemCarrinho = new ItemCarrinho(produtoCarrinho, quantidadeDesejada, precoProduto);
                carrinho.add(itemCarrinho);
                double valorTotalItem = itemCarrinho.getQuantidade() * itemCarrinho.getPrecoUnitario();
                pedido.setValorTotal(pedido.getValorTotal() + valorTotalItem);
                System.out.println(quantidadeDesejada + " unidades de " + produto.getProduto() + " adicionadas ao carrinho!");
            } else {
                System.out.println("Produto " + produto.getProduto() + " sem estoque no momento. Quantidade disponível: " + quantidadeEstoque);
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public void alterarProdutos(int posicao, int quantidade) {
        try {
            Produto produto = cadastroProduto.obterProduto(posicao);
            if (produto.getQuantidade() < quantidade) {
                System.out.println("Quantidade indisponível para o produto " + produto.getProduto() + ". Estoque atual: " + produto.getQuantidade() + " unidades");
            } else {
                produto.setQuantidade(produto.getQuantidade() - quantidade);
                double valorAdicionado = produto.getPreco() * quantidade;
                System.out.println("Produto " + produto.getProduto() + " atualizado com sucesso!");
                System.out.println("Valor total do produto atualizado: " + valorAdicionado);
                pedido.setValorTotal(pedido.getValorTotal() + valorAdicionado);
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public void removerProdutos(int posicao) {
        try {
            Produto produto = cadastroProduto.obterProduto(posicao);
            double valorRemovido = produto.getQuantidade() * produto.getPreco();
            System.out.println("Produto " + produto.getProduto() + " removido com sucesso!");
            pedido.setValorTotal(pedido.getValorTotal() - valorRemovido);
            produto.setQuantidade(0);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public Pedido getPedido() {
        return pedido;
    }
}
