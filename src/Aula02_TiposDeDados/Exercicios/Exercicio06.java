package Aula02_TiposDeDados.Exercicios;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x;
        int y;

        System.out.println("Digite o 1º valor inteiro: ");
        x = scanner.nextInt();

        System.out.println("Digite o 2º valor inteiro: ");
        y = scanner.nextInt();

        if(x > y){
            System.out.println(x + " é maior que " + y);
        }
        else{
            System.out.println(y + " é maior que " + x);
        }

        scanner.close();
    }
}
