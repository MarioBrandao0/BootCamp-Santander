package javas.programacao.de.linguagem.fundamentos;

import java.util.Scanner;

public class OperadoresAritimeticos {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        int num1 = x.nextInt();

        System.out.print("Digite o segundo numero: ");
        int num2 = x.nextInt();


        //Potenciação
        System.out.printf("A potencia de %s = %.2f\n", num1, Math.pow(num1, num2));

        //Raiz Quadrada
        System.out.printf("Raiz quadrada de %s = %.2f\n", num1, Math.sqrt(num1));

        // Subtração
        System.out.printf("%s - %s = %s\n", num1, num2, num1 - num2);
        /*
        Ex: num1 = -15
            num2 = -20
            logo -15 - -20 = X
            pois - -20 == 20
            logo -15 + 20 = 5
        */

        // Adição
        System.out.printf("%s + %s = %s\n", num1, num2, num1 + num2);
        /*
        Ex: num1 = 10
            num2 = 5
            10 + 5 = 15
        */

        // Multiplicação
        System.out.printf("%s * %s = %s\n", num1, num2, num1 * num2);
        /*
        Ex: num1 = 6
            num2 = 7
            6 * 7 = 42
        */

        // Divisão
        if (num2 != 0) {
            System.out.printf("%s / %s = %s\n", num1, num2, num1 / num2);
        } else {
            System.out.println("Não é possível dividir por zero.");
        }
        /*
        Ex: num1 = 20
            num2 = 4
            20 / 4 = 5
        */

        // Módulo (resto da divisão)
        if (num2 != 0) {
            System.out.printf("%s %% %s = %s\n", num1, num2, num1 % num2);
        } else {
            System.out.println("Não é possível calcular o módulo com zero.");
        }
        /*
        Ex: num1 = 17
            num2 = 5
            17 % 5 = 2 (pois 17 dividido por 5 dá 3, e sobra 2)
        */
    }
}
