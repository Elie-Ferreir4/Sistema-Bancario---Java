# Sistema-Bancario---Java

Sistema de Contas Bancárias em Java

Este é um sistema simples de contas bancárias desenvolvido em Java. Ele permite aos usuários criar contas bancárias e acessá-las posteriormente.
Funcionalidades

    Criar conta: Os usuários podem criar uma nova conta bancária fornecendo seu nome e agência.
    Acessar conta: Os usuários podem acessar uma conta bancária existente fornecendo seu nome e agência. Se as informações estiverem corretas, a conta é acessada; caso contrário, o acesso é negado.
    Sair: Os usuários podem optar por sair do sistema a qualquer momento.

Estrutura do Projeto

O projeto é composto por dois arquivos principais:

    Main.java: Este arquivo contém o método principal main que inicializa o sistema e interage com o usuário através de um loop de entrada.
    User.java: Este arquivo define a classe User, que representa um usuário do sistema de contas bancárias. Ele contém os atributos de nome e agência do usuário, além de métodos para acessar e modificar esses atributos.

Pré-requisitos

    Java Development Kit (JDK) instalado na máquina.

Como Executar

    Clone ou faça o download deste repositório para o seu ambiente local.
    Navegue até o diretório onde os arquivos estão localizados.
    Compile os arquivos Java executando o seguinte comando no terminal:

bash

javac Main.java User.java

    Execute o arquivo compilado Main.class usando o seguinte comando:

bash

java Main

Contribuição

Contribuições são bem-vindas! Se você encontrar problemas ou tiver sugestões de melhorias, sinta-se à vontade para abrir uma issue neste repositório ou enviar um pull request.

Codigo:
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
                case "C":
                case "c":

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

                case "a":
                case "A":
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
                case "e":
                case "E":
                    System.out.println("voce escolheu sair");
                    break;
            }

        }

    }
}



package User.Account;


import java.util.ArrayList;

public class User {
    private String userName;
    private String userAgency;
    private double cash;


    public User (String name, String agency) {
        setNameUser(name);
        setAgency(agency);
    }

    public String getUserName() {
        return userName;
    }

    public String getUserAgency() {
        return userAgency;
    }

    private void setNameUser (String name) {
        userName = name;
    }

    private void setAgency (String agency) {
        userAgency = agency;
    }

    @Override
    public String toString() {
        return "Usuario: " + userName + " Agencia: " + userAgency;
    }
}
