package Aula04_EstruturaDeDecisao.Exemplos;

import java.util.Scanner;

public class Exemplo2 {
    public static void main(String[] args) {

        String corSemaforo;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a cor do semáforo: ");
        corSemaforo = scanner.next();


        if(corSemaforo.equals("verde") || corSemaforo.equals("Verde")){
            System.out.println("siga!");
        }
        else if(corSemaforo.equals("amarelo") || corSemaforo.equals("Amarelo")){
            System.out.println("atenção");
        }
        else if(corSemaforo.equals("vermelho") || corSemaforo.equals("Vermelho")){
            System.out.println("pare!");
        }
        else{
            System.out.println("nunca vi semáforo com a cor " + corSemaforo);
        }

        scanner.close();
    }
}
