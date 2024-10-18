package Aula04_EstruturaDeDecisao.Exemplos;

import java.util.Scanner;

public class Exemplo5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcao;

        System.out.println("Escolha uma opção: ");
        System.out.println("\t1 - para a opção 1");
        System.out.println("\t2 - para a opção 2");
        System.out.println("\t3 - para a opção 3");

        opcao = scanner.nextInt();
        switch (opcao){
            case 1:
                System.out.println("nao aguento mais isso aaaaaa");
                break;
            case 2:
                System.out.println("acaba fuvest");
                break;
            case 3:
                System.out.println("quero uma marola!!!");
                break;
            default:
                System.out.println("sem criatividade");
        }
    }
}
