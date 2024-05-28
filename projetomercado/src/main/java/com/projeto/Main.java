package com.projeto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Menus menuu = new Menus();

        int menu = 0;

        do {
            System.out.println("========== MENU ==========");
            System.out.println("1 - Estoque");
            System.out.println("2 - Loja");
            System.out.println("3 - Sair");
            System.out.println("==========================");

            menu = ler.nextInt();
            ler.nextLine();
            switch (menu) {
                case 1:
                    menuu.menuEstoque();
                    break;
                case 2:
                    menuu.menuLoja();
                    break;
            }
        } while (menu != 0);
        ler.close();
    }
}
