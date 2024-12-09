package Aula04_EstruturaDeDecisao.Exercicios;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor em reais (R$): ");
        double valorReais = scanner.nextDouble();

        System.out.println("Digite o código da moeda para qual você quer converter o valor:");
        System.out.println("1 - Dolar");
        System.out.println("2 - Euro");
        System.out.println("3 - Libra");
        int codigoMoeda = scanner.nextInt();

        double valDolar = 6.09;
        double valEuro = 6.43;
        double valLibra = 7.76;

        double valorConvertido;

        switch (codigoMoeda) {
            case 1:
                valorConvertido = valorReais / valDolar;
                System.out.printf("O valor em Dólares é: " + valorConvertido);
                break;
            case 2:
                valorConvertido = valorReais / valEuro;
                System.out.printf("O valor em Euros é: " + valorConvertido);
                break;
            case 3:
                valorConvertido = valorReais / valLibra;
                System.out.printf("O valor em Libras é: " + valorConvertido);
                break;
            default:
                System.out.println("Código inválido!");
                break;
        }
    }
}
