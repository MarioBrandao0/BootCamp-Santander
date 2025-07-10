package fundamentos;

import java.util.Scanner;

public class TratamentoExecptions {
    private static Scanner x = new Scanner(System.in);
    public static void main(String[] args) {
        try {
            test();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Erro ao executar");
        }
    }

    private static void test() {
        System.out.println("Digite seu nome: ");
        String nome = x.next();

        if (!nome.equalsIgnoreCase("Mario")) throw new RuntimeException();//Podemos forçar uma Exception passando o tipó dela e tratando na classe onde esta sendo chamada

        System.out.println("Olá Mario");
    }
}
