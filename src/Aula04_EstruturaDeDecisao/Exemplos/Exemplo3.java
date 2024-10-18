package Aula04_EstruturaDeDecisao.Exemplos;

import java.util.Scanner;

public class Exemplo3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int idade;

        System.out.println("Quantos anos você tem?");
        idade = scanner.nextInt();

        if(idade > 0 && idade <= 12){
            System.out.println("Você é uma criança!");
        }
        else if(idade > 12 && idade <=17){
            System.out.println("Você é um adolescente!");
        }
        else if(idade > 17 && idade <=65){
            System.out.println("Você é um adulto!");
        }
        else{
            System.out.println("Vocé é idoso!");
        }


    }
}
