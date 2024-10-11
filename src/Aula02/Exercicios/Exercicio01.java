package Aula02.Exercicios;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua idade:");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura:");
        float altura = scanner.nextFloat();

        System.out.println("Digite seu peso:");
        double peso = scanner.nextDouble();

        System.out.println("Sua idade é " + idade);
        System.out.println("Sua altura é " + altura);
        System.out.println("Sua peso é " + peso);


        scanner.close();








    }

}
