package Aula04_EstruturaDeDecisao.Exercicios;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantas horas você trabalhou?: ");
        int varHora = scanner.nextInt();
        int horaExtra = (varHora - 40) * 10;

        float valorExtra;

        if (varHora > 40) {
            valorExtra = (float) (horaExtra + horaExtra * 0.5);
            System.out.println("Voce recebeu " + valorExtra + " reais de extra");
        } else {
            System.out.println("Você não recebe valor extra :( 30");
        }
    }
}
