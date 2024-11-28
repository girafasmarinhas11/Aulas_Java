package Aula02.Exercicios;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        short varShort = (short) scanner.nextInt();
        int varInt = varShort;
        byte varByte = (byte) varShort;


        System.out.println("O número digitado é " + varShort);
        System.out.println("O número (SHORT) digitado é  " + varShort);
        System.out.println("O número (INT) digitado é  " + varInt);
        System.out.println("O número (BYTE) digitado é  " + varByte);

        scanner.close();
    }
}
