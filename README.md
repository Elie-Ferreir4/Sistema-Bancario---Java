# Sistema Bancário em Java

(Atenção este codigo ainda esta em desenvolvimento)

Este é um sistema bancário simples desenvolvido em Java como parte de um projeto acadêmico ou de aprendizado.

## Funcionalidades

O sistema oferece as seguintes funcionalidades:

1. **Cadastro de Clientes:** Permite o cadastro de novos clientes com informações básicas como nome e agência.
   
2. **Abertura de Contas:** Os clientes podem abrir contas bancárias com um saldo inicial definido.

3. **Transações Financeiras:** Os clientes podem realizar depósitos e saques em suas contas.

4. **Consulta de Saldo:** Os clientes podem consultar o saldo disponível em suas contas.

## Requisitos do Sistema

- Java Development Kit (JDK) 8 ou superior instalado.
- Ambiente de desenvolvimento integrado (IDE) como Eclipse, IntelliJ IDEA, ou similar.

## Como Executar

1. Clone o repositório para o seu ambiente local:

```bash
git clone https://github.com/seu-usuario/sistema-bancario-java.git
```

Abra o projeto em sua IDE preferida.

Execute o aplicativo a partir da classe principal Main.java.

Siga as instruções no terminal para criar contas, acessar contas, realizar transações e consultar saldos.

Contribuições

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues para reportar bugs, sugerir novas funcionalidades ou enviar pull requests.

## Codigo

```java
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
```

##package

```java
package User.Account;

public class User {
    private String userName;
    private String userAgency;


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
