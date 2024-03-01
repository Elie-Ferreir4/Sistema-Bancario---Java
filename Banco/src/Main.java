import User.Account.User;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<User> users = new ArrayList<>();
        System.out.println("Bem vindo");
        int contaConta = 0;
        while (true) {

            System.out.println("C-Criar conta, A-Acessar conta, E-Sair");
            String choice = input.nextLine();

            switch (choice){
                case "C", "c":

                    System.out.println("voce escolheu criar conta");

                    System.out.println("Digite seu nome: ");
                    String nome = input.nextLine();

                    System.out.println("Digite sua agencia: ");
                    String agencia = input.nextLine();

                    User user = new User(nome, agencia);
                    users.add(user);

                    System.out.println(users.get(0).toString());
                    System.out.println(users.get(contaConta).toString());
                    contaConta++;
                    break;

                case "a", "A":
                    System.out.println("voce escolheu acessar conta");
                    System.out.println(" ");

                    System.out.println("Conteúdo do ArrayList: " + users);

                    System.out.println(" ");
                    System.out.println("Digite seu nome: ");
                    nome = input.nextLine();

                    System.out.println("Digite sua agencia: ");
                    agencia = input.nextLine();


                    for (User nameuser : users) {
                        if (nameuser.getUserName().equals(nome) && nameuser.getUserAgency().equals(agencia)) {
                            System.out.println("conta acessada");
                        } else {
                            System.out.println("acesso negado");
                        }
                    }


                    System.out.println(users);


                    break;
                case "e", "E":
                    System.out.println("voce escolheu sair");
                    break;
            }

        }

    }
}