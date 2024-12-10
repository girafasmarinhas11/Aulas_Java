package Aula07_Funcoes.Exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int numero1 = scanner.nextInt();

        int dobro = dobrar(numero1);
        System.out.println("O dobro do número inteiro é " + dobro);
    }
    private static int dobrar(int num1) {
        return 2 * num1;
    }
}
