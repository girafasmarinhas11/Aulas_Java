package Aula06_VetoresMatrizes.Exercicios;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] nomes = {"Sebastian","Julia","Ana"};
        boolean verificacao = false;

        System.out.println("Qual nome desejas verificar se está no vetor?");
        String scanner1 = scanner.next();

        for (String nome : nomes) {
            if (nome.equals(scanner1)) {
                verificacao = true;
                break;
            }
        }
        if (verificacao) {
            System.out.println("Esse nome está presente no vetor");
        } else {
            System.out.println("Esse nome não está presente no vetor");
        }

        scanner.close();
    }
}

