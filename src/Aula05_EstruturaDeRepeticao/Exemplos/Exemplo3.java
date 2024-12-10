package Aula05_EstruturaDeRepeticao.Exemplos;

import java.util.Scanner;

public class Exemplo3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Escolha uma opção");

            System.out.println("\t1 - Para escolher opção 1");
            System.out.println("\t2 - Para escolher opção 2");
            System.out.println("\t3 - Para escolher opção 3");
            System.out.println("\t4 - Sair");
            opcao = scanner.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Parabéns! Você escolheu a opcão 1");
                    break;
                case 2:
                    System.out.println("Parabéns! Você escolheu a opcão 2");
                    break;
                case 3:
                    System.out.println("Parabéns! Você escolheu a opcão 3");
                    break;
                case 4:
                    System.out.println("tchau!");
                    break;
                default:
                    System.out.println("Opcao inválida");
            }
        }

        while (opcao != 4);
        System.out.println("Fim do programa! ");

        scanner.close();

    }
}
