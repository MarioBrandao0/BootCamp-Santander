package exercicios;

import java.time.LocalDate;
import java.util.Scanner;

public class Exercicio01 {
    private static Scanner x = new Scanner(System.in);
    //Escrever um codigo que peça o nome e a idade e exiba "Ola fulano, vc tem X anos"
    private static void nomeIdade() {
        System.out.print("Digite seu nome: ");
        String nome = x.nextLine();

        System.out.print("Digite o ano de nascimento: ");
        int anoNascimento = x.nextInt();

        System.out.printf("Ola %s você tem %d anos\n", nome, (LocalDate.now().getYear() - anoNascimento));
    }

    //Escrever um codigo que calcule a area de um quadrado
    private static void areaQuadrado() {
        System.out.print("Digite o tamanho de um dos lados do quadrado: ");
        float tamanho = x.nextFloat();
        System.out.printf("A area do quadrado é %.2f\n", tamanho * tamanho);
    }

    //Escrever codigo que calcule a area de um retangulo
    private static void areaRetangulo() {
        System.out.print("Digite o base da base do seu retangulo: ");
        float base = x.nextFloat();

        System.out.print("Digite a altura do seu retangulo: ");
        float altura = x.nextFloat();

        System.out.printf("A area do retangulo é %.2f\n", base * altura);
    }

    //Escrever um codigo que receba dois nomes de pessoas diferentes e diga a diferença de idade entre elas
    private static void diferencaIdade() {
        System.out.print("Nome da primeira pessoa: ");
        String nome = x.nextLine();

        System.out.print("Nome da segunda pessoa: ");
        String nome2 = x.nextLine();

        System.out.print("Idade da primeira pessoa: ");
        int idade = x.nextInt();

        System.out.print("Idade da segunda pessoa: ");
        int idade2 = x.nextInt();

        int diferenca = idade - idade2;

        System.out.printf("Pessoa 1:\nNome: %s\nIdade: %d\n", nome, idade);
        System.out.printf("Pessoa 2:\nNome: %s\nIdade: %d\n", nome2, idade2);

        System.out.printf("Diferença de idade entre %s e %s é de %d anos",  nome, nome2, (diferenca > 0 ? diferenca : (diferenca * -1)));
    }

    public static void main(String[] args) {
        nomeIdade();
        areaQuadrado();
        areaRetangulo();
        diferencaIdade();
    }
}
