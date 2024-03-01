# Sistema Bancário em Java

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

    Abra o projeto em sua IDE preferida.

    Execute o aplicativo a partir da classe principal Main.java.

    Siga as instruções no terminal para criar contas, acessar contas, realizar transações e consultar saldos.

Contribuições

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues para reportar bugs, sugerir novas funcionalidades ou enviar pull requests.

```java
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

            switch (choice) {
                case "C", "c":

                    System.out.println("Voce escolheu criar conta");

                    System.out.println("Digite seu nome: ");
                    String nome = input.nextLine();

                    System.out.println("Digite sua agencia: ");
                    String agencia = input.nextLine();

                    System.out.println("Digite o saldo inicial: ");
                    double saldoInicial = input.nextDouble();

                    User user = new User(nome, agencia, saldoInicial);
                    users.add(user);

                    System.out.println("Conta criada com sucesso!");
                    System.out.println(user);
                    contaConta++;
                    break;

                case "a", "A":
                    System.out.println("Voce escolheu acessar conta");

                    System.out.println("Digite seu nome: ");
                    nome = input.nextLine();

                    System.out.println("Digite sua agencia: ");
                    agencia = input.nextLine();

                    boolean contaEncontrada = false;

                    for (User currentUser : users) {
                        if (currentUser.getUserName().equals(nome) && currentUser.getUserAgency().equals(agencia)) {
                            contaEncontrada = true;
                            System.out.println("Conta acessada com sucesso!");
                            System.out.println(currentUser);
                            System.out.println("Escolha a operacao:");
                            System.out.println("D - Deposito");
                            System.out.println("S - Saque");
                            System.out.println("V - Ver Saldo");
                            String opcao = input.nextLine();

                            switch (opcao.toUpperCase()) {
                                case "D":
                                    System.out.println("Digite o valor do deposito: ");
                                    double deposito = input.nextDouble();
                                    currentUser.deposit(deposito);
                                    System.out.println("Deposito realizado com sucesso!");
                                    break;
                                case "S":
                                    System.out.println("Digite o valor do saque: ");
                                    double saque = input.nextDouble();
                                    if (currentUser.withdraw(saque)) {
                                        System.out.println("Saque realizado com sucesso!");
                                    } else {
                                        System.out.println("Saldo insuficiente para realizar o saque.");
                                    }
                                    break;
                                case "V":
                                    System.out.println("Saldo atual: " + currentUser.getBalance());
                                    break;
                                default:
                                    System.out.println("Opcao invalida.");
                                    break;
                            }
                        }
                    }

                    if (!contaEncontrada) {
                        System.out.println("Conta nao encontrada.");
                    }

                    break;
                case "e", "E":
                    System.out.println("Voce escolheu sair");
                    return;
                default:
                    System.out.println("Opcao invalida.");
                    break;
            }

        }

    }
}

class User {
    private String userName;
    private String userAgency;
    private double balance;

    public User(String name, String agency, double initialBalance) {
        setNameUser(name);
        setAgency(agency);
        setBalance(initialBalance);
    }

    public String getUserName() {
        return userName;
    }

    public String getUserAgency() {
        return userAgency;
    }

    public double getBalance() {
        return balance;
    }

    private void setNameUser(String name) {
        userName = name;
    }

    private void setAgency(String agency) {
        userAgency = agency;
    }

    private void setBalance(double initialBalance) {
        balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Usuario: " + userName + ", Agencia: " + userAgency + ", Saldo: " + balance;
    }
}

```java
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

