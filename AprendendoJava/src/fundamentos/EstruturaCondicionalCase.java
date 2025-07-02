import java.util.Scanner;

public class EstruturaCondicionalCase {
    private static Scanner x = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Informe um numero de 1 a 7: ");
        int optional = x.nextInt();

        /*switch (optional) {
            case 1:
            case 7: // podemos colocar dois cases juntos
                System.out.println("Domingo");
                break;

            case 2:
                System.out.println("Segunda");
                break;

            case 3:
                System.out.println("Terca");
                break;

            case 4:
                System.out.println("Quarta");
                break;

            case 5:
                System.out.println("Quinta");
                break;

            case 6:
                System.out.println("Sexta");
                break;

            default:
                System.out.println("Opcao invalida");
                break;
        }*/

        /*switch (optional) {
            case 1, 7 -> System.out.println("Fim de semana");
            case 2 -> System.out.println("Segunda");
            case 3 -> System.out.println("Terca");
            case 4 -> System.out.println("Quarta");
            case 5 -> System.out.println("Quinta");
            case 6 -> System.out.println("Sexta");
            default -> System.out.println("Opcao invalida");
        }*/

        String mensagem = switch (optional) {
            case 1, 7 -> {
                String day = optional == 1 ? "Domingo" : "Sabado";
                yield String.format("Hoje é %s,  fim de semana", day); // yield 
            }
            case 2 -> "Segunda";
            case 3 -> "Terca";
            case 4 -> "Quarta";
            case 5 -> "Quinta";
            case 6 -> "Sexta";
            default -> "Opcao invalida";
        };

        System.out.println(mensagem);
    }

}
