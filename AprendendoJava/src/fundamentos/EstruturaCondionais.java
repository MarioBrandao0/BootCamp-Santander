package fundamentos;

import java.util.Scanner;

public class EstruturaCondionais {
    private static Scanner x = new Scanner(System.in);
    public static void main(String[] args) {
        String mensagem = "";

        System.out.print("Digite seu nome: ");
        String nome = x.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = x.nextInt();

        System.out.print("Você é amencimado? ");
        boolean isEmancipated = x.next().equalsIgnoreCase("s");

        boolean canDrive = (idade >= 18) || (idade >= 16 && isEmancipated);

        /*if(canDrive) {
            mensagem = nome + " Voce pode dirigir";
        } else {
            mensagem = nome + " Voce nao pode dirigir";
        }*/

        // Ou poderimos fazer dessa maneira
        mensagem = canDrive ? nome + " Voce pode dirigir" : nome + " Voce nao pode dirigir";

        System.out.println(mensagem);
        System.out.println("Fim da execução");
    }
}


