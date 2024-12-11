package Aula07_Funcoes.Exercicios;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a 1º nota: ");
        double nota1 = scanner.nextDouble();
        System.out.println("Digite a 2º nota: ");
        double nota2 = scanner.nextDouble();
        System.out.println("Digite a 3º nota: ");
        double nota3 = scanner.nextDouble();

        double media = calcularMedia(nota1,nota2,nota3);
        System.out.println("A média das notas é igual a " + media);

        scanner.close();
    }

    static double calcularMedia (double nota1, double nota2, double nota3) {
        return (nota1 + nota2 + nota3) / 3;
    }
}
