import java.util.Scanner;

public class Main {
    /*
    Usamos o "final" para declarar constantes
    Os nomes das variaveis constantes, tem que sempre estar ma caixa alta
    */
    private static final String WELCOME_MESSAGE = "Bem vindo";
    private static final Scanner x = new Scanner(System.in);
    public static void main(String[] args) {
        //Ola mundo
        System.out.println(WELCOME_MESSAGE);
        System.out.print("Ola, infome o nome de alguem: ");

        /*
        So podemos usar o "var" quando a variavel recebe algum retorno ou quando o valor
        É atribuido a ela. Não da para colocar "Var" em uma variavel sem estar inicializada
        */

        var nome = x.next();

        System.out.print("Informe sua idade: ");
        var idade = x.nextInt();

        System.out.printf("Ola %s sua idade é %s \n", nome, idade);

    }
}