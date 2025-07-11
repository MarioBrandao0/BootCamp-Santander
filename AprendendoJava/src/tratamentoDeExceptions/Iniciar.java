package tratamentoDeExceptions;

import tratamentoDeExceptions.dao.UserDAO;
import tratamentoDeExceptions.mode.MenuOption;
import tratamentoDeExceptions.mode.UserModel;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

public class Iniciar {

    private final static UserDAO userDAO = new UserDAO();
    private final static Scanner x = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("=".repeat(20));
            System.out.println("Bem vindo ao cadastro de usuários, Selecione a sua opção");
            System.out.println("[1] -> Cadastrar");
            System.out.println("[2] -> Atualizar");
            System.out.println("[3] -> Deletar");
            System.out.println("[4] -> Buscar usuário especifico");
            System.out.println("[5] -> Listar");
            System.out.println("[6] -> Sair");
            System.out.print("Sua opção: ");
            int inputUser = x.nextInt();

            MenuOption selectedOption = MenuOption.values()[inputUser - 1];

            switch (selectedOption) {
                case SAVE -> {
                    UserModel novoUser = userDAO.save(requestUserSave());
                    System.out.printf("Usuário salvo com sucesso\n%s\n", novoUser.toString());
                }
                case DELETE -> {
                    userDAO.delete(requestId());
                    System.out.println("Usuário deletado com sucesso");
                }
                case UPDATE ->  userDAO.update(requestUserUpdate());
                case FIND_BY_ID -> userDAO.findById(requestId());
                case FIND_ALL -> {
                    List<UserModel> encontrados = userDAO.findAll();
                    System.out.println("=".repeat(20));
                    System.out.println("Usuários Encontrados:");
                    encontrados.forEach(System.out::println);
                    System.out.println("==========FIM==========");
                }
                case EXIT -> System.exit(0);

            }

        }
    }


    private static UserModel requestUserSave() {
        System.out.println("Informe o seu nome: ");
        String nome = x.next();
        System.out.println("Informe o seu email: ");
        String email = x.next();
        System.out.println("Informe o seu aniversário(dd/MM/yyyy): ");
        String inputAniversario = x.next();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate dataAniversario = LocalDate.parse(inputAniversario, formatter);

        return new UserModel(nome, email, dataAniversario);

    }

    private static long requestId() {
        System.out.println("Informe o dentificador: ");
        long id = x.nextLong();
        return id;
    }


    //Mudar isso aqui
    private static UserModel requestUserUpdate() {
        System.out.println("Informe o seu nome: ");
        String nome = x.next();
        System.out.println("Informe o seu email: ");
        String email = x.next();
        System.out.println("Informe o seu aniversário(dd/MM/yyyy): ");
        String inputAniversario = x.next();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate dataAniversario = LocalDate.parse(inputAniversario, formatter);

        return new UserModel(nome, email, dataAniversario);
    }

}
