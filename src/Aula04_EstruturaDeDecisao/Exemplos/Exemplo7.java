package Aula04_EstruturaDeDecisao.Exemplos;

import java.util.Scanner;

public class Exemplo7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float valorFinal;
        float desconto = 0.2f;
        System.out.println("Digite o valor da compra.");

        float valorCompra = scanner.nextFloat();
        valorFinal = valorCompra > 100 ? valorCompra - valorCompra * desconto: valorCompra;

        System.out.println("o valor final da compra será de " + valorFinal);
    }
}
