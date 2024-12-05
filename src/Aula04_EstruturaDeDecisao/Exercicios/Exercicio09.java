package Aula04_EstruturaDeDecisao.Exercicios;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int opcao;

        System.out.println("Escolha um turno de trabalho:");
        System.out.println("\t - (1) 5h - 12h");
        System.out.println("\t - (2) 12h - 18h");
        System.out.println("\t - (3) 18h - 22h");
        System.out.println("\t - (4) 22h - 5h");

        opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                if(opcao >= 5 && opcao < 12){
                    System.out.println("Esse turno é de manhã");
                }
                break;
            case 2:
                System.out.println("Esse turno é de tarde");
                break;
            case 3:
                System.out.println("Esse turno é de noite");
                break;
            case 4:
                System.out.println("Esse turno é de madrugada");
                break;
            default:
                System.out.println("Valor invalido!");
        }
    }
}
