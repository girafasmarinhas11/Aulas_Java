package Aula02_TiposDeDados.Exemplos;
import java.util.Scanner;


public class Exemplo7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digitar um número inteiro: ");

        int varInt = scanner.nextInt();
        short varShort = (short) varInt;
        byte varByte = (byte) varShort;

        System.out.println("O número inteiro digitado é: " + varInt);
        System.out.println("varShort = " + varShort);
        System.out.println("varByte = " + varByte);

        System.out.println("Digitar um número decimal; ");
        double varDouble = scanner.nextDouble();
        float varFloat = (float) varDouble;

        System.out.println("O número decimal digitado é: " + varDouble);
        System.out.println("varFloat = " + varFloat);

        scanner.close();
    }
}
