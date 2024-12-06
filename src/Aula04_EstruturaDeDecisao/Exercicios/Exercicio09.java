package Aula04_EstruturaDeDecisao.Exercicios;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a hora atual: ");

        int horaAtual = scanner.nextInt();
        String turno;

        if (horaAtual >= 5 && horaAtual < 12) {
            turno = "Manhã";
        } else if (horaAtual >= 12 && horaAtual < 18) {
            turno = "Tarde";
        } else if (horaAtual >= 18 && horaAtual < 22) {
            turno = "Noite";
        } else {
            turno = "Madrugada";
        }

        System.out.println("A hora " + horaAtual + "h pertence ao turno da " + turno);

        scanner.close();
    }
}
