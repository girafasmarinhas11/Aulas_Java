package Aula04_EstruturaDeDecisao.Exercicios;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual nota você tirou?: ");
        int nota = scanner.nextInt();

        if (nota >= 7) {
            System.out.println("Voce tirou " + nota + ", Aprovado! ");
        }
        else if (nota >= 5 && nota <=7) {
            System.out.println("Voce tirou " + nota + ", vai ter que passar pela recuperação. ");
        }
        else {
            System.out.println("Voce tirou " + nota + ", Reprovado... ");
        }

    }
}
