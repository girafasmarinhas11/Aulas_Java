package Aula04_EstruturaDeDecisao.Exercicios;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor da sua compra: ");
        int valor;
        valor = scanner.nextInt();

        if(valor > 100){
            valor = valor - valor/100 * 10;
            System.out.println("O valor com desconto é de: " + valor);
        }
        else{
            System.out.println("Sem desconto");
        }

    }
}
