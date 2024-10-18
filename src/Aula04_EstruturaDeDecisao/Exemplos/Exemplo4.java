package Aula04_EstruturaDeDecisao.Exemplos;

import java.util.Scanner;

public class Exemplo4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String corSemaforo;
        System.out.println("Digite a cor do semáforo: ");
        corSemaforo = scanner.nextLine();

        switch (corSemaforo){
            case "verde":
                System.out.println("siga!");
                break;
            case "amarelo":
                System.out.println("aguarde!");
                break;
            case "vermelho":
                System.out.println("pare!");
                break;
            default:
                System.out.println("Nunca vi semaforo com a cor" + corSemaforo);
        }
    }
}
