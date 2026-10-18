import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void simuladorDeCaixaEletronico() {
        var scan = new Scanner(System.in);
        char continuar;

        System.out.println("Informe o saldo inicial da conta: ");
        double saldo = scan.nextDouble();

        do {
            System.out.println("MENU");
            System.out.println("Digite um numero de 1 a 4");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar");
            System.out.println("3. Sacar");
            System.out.println("4. Sair");

            int escolha = scan.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("Seu saldo é: " + saldo);
                    break;

                case 2:
                    System.out.println("Digite o valor do deposito: ");
                    double valorDoDeposito = scan.nextDouble();
                    if (valorDoDeposito > 0) {
                        saldo += valorDoDeposito;
                        System.out.println("Depósito realizado com sucesso");
                    } else {
                        System.out.println("Valor inválido para deposito");
                    }
                    break;

                case 3:
                    System.out.println("Digite o valor a ser sacado: ");
                    double valorDoSaque = scan.nextDouble();

                    if (valorDoSaque > 0 && valorDoSaque <= saldo) {
                        saldo -= valorDoSaque;
                        System.out.println("Saque realizado com sucesso");
                    } else {
                        System.out.println("Saldo insuficiente");
                    }
                    break;

                case 4:
                    System.out.println("Encerrando o programa");
                    return;

                default:
                    System.out.println("Insira um valor valido");
            }

            System.out.println("Deseja continuar (S/N)?");
            continuar = scan.next().toUpperCase().charAt(0);

        } while (continuar == 'S');
        System.out.println("Programa encerrado");
    }
}