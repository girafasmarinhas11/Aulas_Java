package Aula02.Exercicios;

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a primeira nota:");
        int x = scanner.nextInt();

        System.out.println("Digite a segunda nota:");
        int y = scanner.nextInt();

        System.out.println("Digite a terceira nota:");
        int z = scanner.nextInt();

        System.out.println("O valor da soma das notas é " + (x + y + z) );


    }
}
