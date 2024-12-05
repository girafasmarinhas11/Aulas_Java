package Aula04_EstruturaDeDecisao.Exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("quanto tu vendeu nego???: ");
        float valorVendas = scanner.nextFloat();

        float comissao;


        if (valorVendas <1000){
            comissao = 0.05F;
        } else if (valorVendas >= 1000 && valorVendas <= 5000) {
            comissao = 0.1F;
        }else{
            comissao = 0.15F;
        }

        float valorFinal;

        valorFinal = valorVendas + valorVendas * comissao;
        System.out.println(valorFinal);

    }
}
