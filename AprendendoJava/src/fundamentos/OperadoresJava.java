package fundamentos;

import java.util.Scanner;

public class OperadoresJava {
    static Scanner x = new Scanner(System.in);// o = é o operador de atribuição
    public static void main(String[] args) {

       MaiorEMenor();

        /* System.out.println("Quanto que é 2 + 2?");
        int age = x.nextInt();

        boolean isWrong = age != 4;

        System.out.printf("O resultado é 4, vc acertou??\nSua Resposta -> (%s)", age == 4 ? "Acertou" : "Errou");//Podemos fazer comparações direto na impressão

        System.out.printf("O resultado é 4, vc acertou??\nSua Resposta -> (%s)", !isWrong);//Aqui estamos negando a reposta da variavel isWrong
        */
    }


    public static void MaiorEMenor() {
        System.out.println("Você tem quantos anos? ");
        int age = x.nextInt();

        System.out.println("Você é emacipado?");
        boolean isEmamcipated = x.nextBoolean();


        boolean canDrive = age >= 18 || (isEmamcipated && age >= 16);//Podemos inverter o valor ja na propria expressão, sem precisar declarar novamente

        System.out.println(canDrive? "Voce pode dirigir" : "Você não pode dirigir");

    }

    public static void tabelaVerdade() {
        System.out.println("Operador && (E lógico)");
        System.out.printf("true  && true  = %s\n", true && true);
        System.out.printf("true  && false = %s\n", true && false);
        System.out.printf("false && true  = %s\n", false && true);
        System.out.printf("false && false = %s\n", false && false);

        System.out.println("-".repeat(90));

        System.out.println("\nOperador || (OU lógico)");
        System.out.printf("true  || true  = %s\n", true || true);
        System.out.printf("true  || false = %s\n", true || false);
        System.out.printf("false || true  = %s\n", false || true);
        System.out.printf("false || false = %s\n", false || false);
    }

}
