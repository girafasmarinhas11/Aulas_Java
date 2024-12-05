package Aula04_EstruturaDeDecisao.Exercicios;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int opcao;

        System.out.println("Qual é a avaliação do funcionário: ");
        System.out.println("\t - (1) ");
        System.out.println("\t - (2) ");
        System.out.println("\t - (3) ");
        System.out.println("\t - (4) ");
        System.out.println("\t - (5) ");

        opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("O funcionário teve avalição: Precisa melhorar");
                break;
            case 2:
                System.out.println("O funcionário teve avalição: Abaixo da média");
                break;
            case 3:
                System.out.println("O funcionário teve avalição: Média");
                break;
            case 4:
                System.out.println("O funcionário teve avalição: Acima da média");
                break;
            case 5:
                System.out.println("O funcionário teve avalição: Excelente");
                break;
            default:
                System.out.println("valor fora da avaliação!");
        }
    }
}
