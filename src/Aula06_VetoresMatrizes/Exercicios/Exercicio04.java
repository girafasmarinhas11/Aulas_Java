package Aula06_VetoresMatrizes.Exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] notas = new double[4];
        double media = 0;

        for (int i = 0; i < 4; i++) {
            System.out.println("Digite a nota " + (i+1) + ": ");
            notas[i] = scanner.nextDouble();
            media += notas[i];
        }
        media = media / notas.length;

        System.out.println("A média das 4 notas é: " + media);
        scanner.close();
    }
}

