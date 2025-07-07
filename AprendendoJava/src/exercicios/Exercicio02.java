package org.example.exercicios;

import java.util.Scanner;

public class Exercicio02 {
    private static final Scanner x = new Scanner(System.in);
    //Fazer um programa que o usuario digite um numero e faca a tabuada completa
    private static void tabuada(int numero) {

        for (int i = 0; i <= 10; i++) {
            System.out.printf("%d X %d = %d\n", numero, i, numero * i);
        }
    }


    private static void pesoIMC() {


        System.out.println("Digite seu peso: ");
        float peso = x.nextFloat();

        System.out.println("DIgite sua altura: ");
        float altura = x.nextFloat();

        float IMC = peso/(altura * altura);

        if (IMC < 18.5) {
            System.out.println("Abaixo do peso");
        }
        
        else if (IMC >= 18.6 && IMC <= 24.9) {
            System.out.println("Peso ideal");
        }

        else if (IMC >= 25 && IMC <= 29.9) {
            System.out.println("Levemente acima do peso");
        }

        else if (IMC >= 30 && IMC <= 34.4) {
            System.out.println("Obesidade Grau I");
        }

        else if (IMC >= 35 && IMC <= 39.9) {
            System.out.println("Obesidade Grau II");
        }

        else{
            System.out.println("Obesidade Morbida");
        }
    }


    private static void imparPar() {

        System.out.println("Digite o numero de inicio: ");
        int numeroInicial = x.nextInt();

        System.out.println("Digite o limite: ");
        int intervalo = x.nextInt();
        x.nextLine();

        System.out.println("Voce quer os numeros pares os impares?: ");
        String escolha = x.next();
        x.nextLine();

        //Caso o numero inicial seja menor que o intervalo ele ira ficar pedindo o intervalo ate que a requisicao seja atendida
        while (numeroInicial >= intervalo) {
            System.out.println("Por favor, digite um numero maior que o inicial: ");
            intervalo = x.nextInt();
        }


        if (escolha.equalsIgnoreCase("par")) {
            for (int i = intervalo; i >= numeroInicial; i--) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        }

        else if (escolha.equalsIgnoreCase("impar")) {
            for (int i = intervalo; i >= numeroInicial; i --) {
                if (i % 2 != 0) {
                    System.out.println(i);
                }
            }
        }


    }

    private static void repeticoesAteDiferenteZero() {
        int segundoNumero = 0;
        System.out.println("Digite o numero inicial: ");
        int numeroInical = x.nextInt();

        do {
            System.out.println("-".repeat(80));
            System.out.println("Digite um numero:");
            int entrada = x.nextInt();

            if (entrada < numeroInical) {
                continue;
            }

            segundoNumero = entrada;

        }while (segundoNumero % numeroInical == 0);
    }

    public static void main(String[] args) {
        //tabuada(2);
        //pesoIMC();
        imparPar();
        //repeticoesAteDiferenteZero();
    }
}
