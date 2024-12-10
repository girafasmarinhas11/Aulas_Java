package Aula02_TiposDeDados.Exercicios;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número:");
        int x = scanner.nextInt();
        double y  = x;

        System.out.println("Int: " + x);
        System.out.println("Double: " + y);

        scanner.close();

    }
}
