package Aula02.Exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de horas trabalhadas:");
        int horasTrabalhadas = scanner.nextInt();

        System.out.println("Digite o valor pago por hora:");
        int valorPago = scanner.nextInt();

        System.out.println("O valor que sera recebido é: " + horasTrabalhadas * valorPago + "reais");

        scanner.close();


    }
}
