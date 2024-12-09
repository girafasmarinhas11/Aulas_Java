package Aula05.Exercicios;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double somaNotas = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite suas notas: ");
            somaNotas += scanner.nextDouble();
        }

        double media = somaNotas / 5;
        System.out.println("A média das notas é igual a "+ media);

        scanner.close();
    }
}
