package Aula02_TiposDeDados.Exercicios;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor booleano: ");
        boolean cond1 = scanner.nextBoolean();

        System.out.println("Digite um 2º valor booleano: ");
        boolean cond2 = scanner.nextBoolean();

        System.out.println("Digite um 3º valor booleano: ");
        boolean cond3 = scanner.nextBoolean();

        boolean resultadoAnd = cond1 && cond2 && cond3;
        boolean resultadoOr = cond1 || cond2 || cond3;

        System.out.println("cond1 + cond2 + cond3 " + resultadoAnd);
        System.out.println("cond1 || cond2 || cond3 " + resultadoOr);

        scanner.close();


    }
}
