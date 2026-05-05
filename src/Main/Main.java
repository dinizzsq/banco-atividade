package Main;

import Gerenciadores.Gerenciador_conta;
import Models.Conta;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Gerenciador_conta gerenciadorConta = new Gerenciador_conta();

        System.out.println("Deseja criar uma conta?");
        String resposta = scanner.nextLine();

        if (resposta.equalsIgnoreCase("sim")) {

            System.out.println("Digite seu nome completo: ");
            String nome = scanner.nextLine();

            System.out.println("Digite sua idade: ");
            int idade = Integer.parseInt(scanner.nextLine());

            System.out.println("Digite seu cpf: ");
            String cpf = scanner.nextLine();

            double saldo = 0.0;

            Conta conta = new Conta(nome, idade, saldo, cpf);

            System.out.println("Deseja fazer um depósito inicial?");
            String respostadep = scanner.nextLine();

            if (respostadep.equalsIgnoreCase("sim")) {
                System.out.println("Quanto deseja depositar? ");
                double valor = Double.parseDouble(scanner.nextLine());

                gerenciadorConta.depositar(conta, valor); //
            }

            System.out.println("\nConta criada!");
            System.out.println("Nome: " + conta.getNome());
            System.out.println("Saldo: " + conta.getSaldo());
            System.out.println("Cpf: "+ conta.getCpf());
            System.out.println("Idade: "+ conta.getIdade());
        }

        scanner.close();
    }
}