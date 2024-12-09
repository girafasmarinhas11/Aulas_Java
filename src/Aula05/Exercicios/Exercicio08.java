package Aula05.Exercicios;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        int impar = 0;
        int par = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite números inteiros: ");
            num = scanner.nextInt();
            num = num%2 == 0 ? par++ : impar++;
        }

        System.out.println("Numeros impares: "+par);
        System.out.println("Numeros impares: "+impar);

        scanner.close();
    }
}
