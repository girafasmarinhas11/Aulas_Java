package Aula05_EstruturaDeRepeticao.Exercicios;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nota;

        do {
            System.out.print("Digite uma nota entre 0 e 10: ");
            nota = scanner.nextDouble();

            if (nota < 0 || nota > 10) {
                System.out.println("Nota inválida. Por favor, tente novamente.");
            }
        }
        while (nota < 0 || nota > 10);

        System.out.println("Nota válida registrada: " + nota);

        scanner.close();
    }
}
