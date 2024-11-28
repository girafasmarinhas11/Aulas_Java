package Aula02.Exercicios;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        float largura;
        float altura;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual é a largura do retângulo?:");
        largura = scanner.nextInt();
        System.out.println("Qual é a altrua do retângulo?:");
        altura = scanner.nextInt();

        System.out.println("A área do retângulo é: " + largura * altura);

        scanner.close();

    }
}
