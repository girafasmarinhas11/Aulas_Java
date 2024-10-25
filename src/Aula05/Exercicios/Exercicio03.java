package Aula05.Exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numero = 1;
        System.out.println("Insira o número inteiro: ");
        numero = scanner.nextInt();

        do{
            numero = numero * numero - 1;
        }

        while(numero == 0);
        System.out.println(numero);
    }
}
