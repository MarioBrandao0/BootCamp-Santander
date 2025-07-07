package org.example;

import java.util.Scanner;

public class LacosDeRepeticoesWhile {
    private static final Scanner x = new Scanner(System.in);

    public static void main(String[] args) {
        String name = "";
        int count = 10;
        /*while(!name.equalsIgnoreCase("exit")) {
            System.out.println("Digite outro nome(exit para sair): ");
            name = x.next();

            System.out.println("-".repeat(80));
            System.out.println(name);
            System.out.println("-".repeat(80));
        }*/

        do {
            System.out.println(count);
        } while (count != 10);//Aqui mesmo a validacao sendo verdadeira, ele ira executar pelo menos uma vez o codigo

    }

}
