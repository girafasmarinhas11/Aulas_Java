package Aula05_EstruturaDeRepeticao.Exercicios;

import java.util.Random;
import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {

        Random gerador = new Random();
        int numSorteado = gerador.nextInt(101);

        Scanner scanner = new Scanner(System.in);

        int palpite;
        int tentativas = 0;

        do {
            tentativas++;
            System.out.println("Tente acertar qual é o número de 1 a 100 foi escolhido: ");
            palpite = scanner.nextInt();
        }
        while(palpite!=numSorteado);

        System.out.println("Você acertou após " + tentativas + " tentativas!! ");
        scanner.close();
    }
}
