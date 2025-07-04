package Projetos;

import java.util.Random;
import java.util.Scanner;
public class DesafioBancoTerminal {
    private static Scanner x = new Scanner(System.in);
    private static Random random = new Random();
    public static void main(String[] args) {
        
        System.out.print("Digite seu nome: ");
        String nomeCliente = x.nextLine();

        int numero = random.nextInt(1, 999);

        int agencia = random.nextInt(1,999);

        System.out.print("Saldo a depositar: ");
        float saldo = x.nextFloat();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %d, conta %d e seu saldo %.2f já está disponível para saque", nomeCliente, agencia, numero, saldo);
    }
}