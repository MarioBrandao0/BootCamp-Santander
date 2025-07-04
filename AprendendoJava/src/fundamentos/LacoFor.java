package fundamentos;

import java.util.Scanner;

public class LacoFor {
    private static final Scanner x = new Scanner(System.in);
    public static void main(String[] args) {
        int ii = 2;

        /*for (;;) {
            System.out.println("Digite um numero");
            int numero = x.nextInt();

            if (numero <= 0) break;
            System.out.printf("O numero digitado foi: %d\n", numero);
        }//Fazendo dessa forma o codigo fica em um loop infinito*/


        /*for (; ii < 100; ii++) {
            System.out.println(ii);
        }//Podemos usar variaveis externar para interagir com o for nas configurações

        for (int i = 200; i >= 0; i--) {
            if (i % 2 == 0) continue;//O continue pula para a proxima interação

            System.out.println(i);
        }//podemos fazer de forma decrescente*/

        /*for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }*/

        for (String arg : args) {
            System.out.println(arg);
        }
    }
}
