package Aula04_EstruturaDeDecisao.Exercicios;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o 1ºnúmero: ");
        float num01 = scanner.nextFloat();

        System.out.println("Digite o 2ºnúmero: ");
        float num02 = scanner.nextFloat();

        int opcao;

        System.out.println("Qual é a operação que deseja realizar?:");
        System.out.println("\t - (1) SOMA");
        System.out.println("\t - (2) SUBTRAÇÃO");
        System.out.println("\t - (3) MULTPLICAÇÃO");
        System.out.println("\t - (4) DIVISÃO");


        opcao = scanner.nextInt();


        switch (opcao) {
            case 1:
                System.out.println(num01 + " + " + num02 + " = " + (num01 + num02));
                break;
            case 2:
                System.out.println(num01 + " - " + num02 + " = " + (num01 - num02));
                break;
            case 3:
                System.out.println(num01 + " x " + num02 + " = " + (num01 * num02));
                break;
            case 4:
                System.out.println(num01 + " / " + num02 + " = " + (num01 / num02));
                break;
            default:
                System.out.println("inválido!");
        }

    }
}
