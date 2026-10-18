import java.util.Random;
import java.util.Scanner;

public class Exercicios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero para ver a sua tabuada de 1 a 10:");
        int num1 = scanner.nextInt();
        tabuada(num1);

        System.out.println("\n");

        Random random = new Random();

        int numeroAleatorio = random.nextInt(100) + 1;

        System.out.println("Um numero aleatório foi gerado, tente advinhá-lo.");
        chuteNumerico(numeroAleatorio);

        System.out.println("\n");

        System.out.println("Método da potenciação");

        System.out.println("Digite o valor da base:");
        int base = scanner.nextInt();
        System.out.println("Digite o expoente:");
        int expoente = scanner.nextInt();


        int resultadoPotencia = potenciacao(base, expoente);
        System.out.println("O resultado dessa potencia é: " + resultadoPotencia);

        System.out.println("\n");

        System.out.println("Digite um numero para ver o seu fatorial:");
        int numero = scanner.nextInt();
        long resultadoFatorial = fatorial(numero);
        System.out.println("O resultado de " + numero + " fatorial é: " + resultadoFatorial);

        scanner.close();
    }

    public static void tabuada (int num1){
        //metodo que recebe o parametro inteiro e exibe o resultado da tabuada
        for (int i = 1; i <= 10; i++){
            int resultado = num1 * i;
            System.out.println(num1 + " x " + i + " = " + resultado);
        }
    }
    public static void chuteNumerico(int numeroSecreto) {
        //metodo do numero aleatorio
        Scanner scanner = new Scanner(System.in);
        int palpite;
        do {
        System.out.println("Digite um numero aleatorio e tente acertar o valor: ");
        palpite = scanner.nextInt();

        if (palpite < numeroSecreto){
            System.out.println("O palpite " + palpite + " é menor do que o numero correto!");
        }
        else if (palpite > numeroSecreto) {
            System.out.println("O palpite " + palpite + " é maior do que o numero correto!");
        }
        else {
            System.out.println("O palpite " +palpite  +  " está correto!");
        }
        } while(palpite != numeroSecreto);
    }

    public static int potenciacao (int base, int expoente){
        //metodo da potenciacao de inteiros
        int potencia = Math.powExact(base, expoente);
        return potencia;
    }

    public static long fatorial (int numero) {
        //metodo do numero fatorial informado
        long resultado = 1;
        for (int i = 1; i <= numero; i++){
            resultado *= i;
        }
        return resultado;
    }
}
