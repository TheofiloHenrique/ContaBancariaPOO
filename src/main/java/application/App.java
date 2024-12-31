package application;

import entities.Conta;

import java.util.Scanner;

public class App {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        Conta conta;

        System.out.println("Adicione o número da sua conta bancária");
        int numeroConta = sc.nextInt();

        System.out.println("Adicione o nome da sua conta bancária");
        sc.nextLine();
        String nomeConta = sc.nextLine();

        System.out.println("Deseja fazer um depósito inicial? [s/n]");
        char deposito = sc.next().charAt(0);

        if(deposito == 's'){
            System.out.println("Insira seu depósito inicial:");
            double depositoInicial = sc.nextDouble();
            conta = new Conta(numeroConta,nomeConta,depositoInicial);
        }else{
            conta = new Conta(numeroConta,nomeConta);
        }

        System.out.println();
        System.out.printf("Informações da Conta:");
        System.out.println(conta);

        System.out.println();
        System.out.printf("Faça um depósito: ");
        double novoDeposito = sc.nextDouble();
        conta.deposito(novoDeposito);
        System.out.println(conta);

        System.out.println();
        System.out.printf("Faça um saque: ");
        double saque = sc.nextDouble();
        conta.saque(saque);
        System.out.println(conta);

        sc.close();
    }
}
