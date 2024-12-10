package Aula02_TiposDeDados.Exercicios;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número com valor fracionado :  ");
        float varFloat = scanner.nextFloat();
        long varLong = (long) varFloat;
        double varDouble = varLong;


        System.out.println("O número digitado é " + varFloat);
        System.out.println("O número digitado é (FLOAT): " + varFloat);
        System.out.println("O número digitado é (LONG): " + varLong);
        System.out.println("O número digitado é (DOUBLE): " + varDouble);

        scanner.close();

    }
}
