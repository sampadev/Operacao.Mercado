package com.projeto;

import java.util.Scanner;

public class Menus {

    CadastroProduto cadastroProduto = new CadastroProduto();
    OperacaoMercado operacaoMercado = new OperacaoMercado(cadastroProduto);
    Produto produto = new Produto(null, 0, 0);
    Pedido pedido = new Pedido();
    Scanner ler = new Scanner(System.in);

    public void menuEstoque() {
        int menu = 0;

        do {
            System.out.println("========== MENU ESTOQUE ==========");
            System.out.println("1 - Adicionar Produto");
            System.out.println("2 - Ver Estoque");
            System.out.println("3 - Remover Produto");
            System.out.println("4 - Alterar Produto");
            System.out.println("5 - Sair do menu Estoque");
            System.out.println("==================================");

            menu = ler.nextInt();
            ler.nextLine();
            switch (menu) {
                case 1:
                    System.out.println("========== MENU ESTOQUE ==========");
                    System.out.println("Digite o nome do produto: ");
                    String nomeProduto = ler.nextLine();

                    System.out.println("Digite a quantidade do produto: ");
                    int quantidadeProduto = ler.nextInt();

                    System.out.println("Digite o preço do produto: ");
                    double precoProduto = ler.nextDouble();

                    Produto novoProduto = new Produto(nomeProduto, quantidadeProduto, precoProduto);
                    novoProduto.setNome(nomeProduto);
                    novoProduto.setQuantidade(quantidadeProduto);
                    novoProduto.setPreco(precoProduto);

                    cadastroProduto.novoProduto(novoProduto);

                    System.out.println("Produto adicionado com sucesso!");
                    System.out.println("==================================");
                    break;
                case 2:
                    System.out.println("========== MENU ESTOQUE ==========");
                    cadastroProduto.listarProdutos();
                    System.out.println("==================================");
                    break;
                case 3:
                    System.out.println("========== MENU ESTOQUE ==========");
                    System.out.println("Digite a posiçao do produto que deseja remover: ");
                    int posicao = ler.nextInt();
                    cadastroProduto.removerProduto(posicao);
                    System.out.println("Produto removido com sucesso!");
                    System.out.println("==================================");
                    break;
                case 4:
                    System.out.println("========== MENU ESTOQUE ==========");
                    System.out.println("Digite a posiçao do produto que deseja alterar: ");
                    int posicaoprod = ler.nextInt();
                    ler.nextLine();
                    System.out.println("Digite o nome do produto: ");
                    String nomeProd = ler.nextLine();
                    System.out.println("Digite a quantidade do produto: ");
                    int quantidadeProd = ler.nextInt();
                    System.out.println("Digite o preço do produto: ");
                    double precoProd = ler.nextDouble();
                    cadastroProduto.alterarProduto(posicaoprod, nomeProd, precoProd, quantidadeProd);
                    System.out.println("Produto alterado com sucesso!");
                    System.out.println("==================================");
                    break;
                case 5:
                    System.out.println("Saindo do menu Estoque");
                    menu = 0;
                    break;
            }
        } while (menu != 0);
    }

    public void menuLoja() {
        int menu = 0;
        do {
            System.out.println("========== MENU LOJA ==========");
            System.out.println("1 - Ver Produtos");
            System.out.println("2 - Comprar Produtos");
            System.out.println("3 - Alterar quantidade de produtos");
            System.out.println("4 - Remover Produtos");
            System.out.println("5 - Finalizar Pedido");
            System.out.println("6 - Sair do menu da Loja");

            menu = ler.nextInt();
            ler.nextLine();
            switch (menu) {
                case 1:
                    System.out.println("========== MENU CARRINHO ==========");
                    cadastroProduto.listarProdutos();
                    System.out.println("==================================");
                    break;

                case 2:
                    System.out.println("========== MENU CARRINHO ==========");
                    cadastroProduto.listarProdutos();
                    System.out.println("Digite a posiçao do produto que deseja comprar: ");
                    int posicao = ler.nextInt();
                    System.out.println("Digite a quantidade do produto que deseja comprar: ");
                    int quantidade = ler.nextInt();
                    operacaoMercado.adicionarProdutoCarrinho(posicao, quantidade);
                    System.out.println("==================================");
                    break;

                case 3:
                    System.out.println("========== MENU CARRINHO ==========");
                    System.out.println("Digite a posiçao do produto que deseja alterar a quantidade: ");
                    int posicaoo = ler.nextInt();
                    System.out.println("Digite a quantidade do produto que deseja alterar: ");
                    int quantidadeProduto = ler.nextInt();
                    operacaoMercado.alterarProdutos(posicaoo, quantidadeProduto);
                    System.out.println("==================================");
                    break;

                case 4:
                    System.out.println("========== MENU CARRINHO ==========");
                    System.out.println("Digite a posição do produto que deseja remover: ");
                    int posicaooo = ler.nextInt();
                    operacaoMercado.removerProdutos(posicaooo);
                    System.out.println("==================================");
                    break;

                case 5:
                    System.out.println("========== MENU CARRINHO ==========");
                    double valorTotal = operacaoMercado.getPedido().getValorTotal();
                    System.out.println("Valor total do pedido R$:" + String.format("%.2f", valorTotal));
                    System.out.println("==================================");
                    break;

                case 6:
                    System.out.println("Saindo do menu Loja");
                    menu = 0;
                    break;
            }
        } while (menu != 0);
    }
}
