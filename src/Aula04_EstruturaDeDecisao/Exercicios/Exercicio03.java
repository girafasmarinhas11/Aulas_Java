package Aula04_EstruturaDeDecisao.Exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int produto;

        System.out.println("Escolha uma opção: ");
        System.out.println("\t1 - Eletrônicos");
        System.out.println("\t2 - Alimentos");
        System.out.println("\t3 - Vestuário");

        produto = scanner.nextInt();

        switch (produto){
            case 1:
                System.out.println("Você escolheu a categoria eletrônico!");
                break;
            case 2:
                System.out.println("Você escolheu a categoria alimento!");
                break;
            case 3:
                System.out.println("Você escolheu a categoria vestuário!");
                break;
        }
    }
}
