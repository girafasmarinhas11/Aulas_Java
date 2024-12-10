package Aula05_EstruturaDeRepeticao.Exemplos;

import java.util.Scanner;

public class Exemplo4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("escolha um número para calcular a tabuada");
        int x  = scanner.nextInt();

        for(int multiplicador = 0; multiplicador <=10; multiplicador++){
            System.out.println(x  + " x " + multiplicador + " = " + x* multiplicador);
        }

        scanner.close();
    }
}
