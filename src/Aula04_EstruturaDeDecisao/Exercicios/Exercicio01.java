package Aula04_EstruturaDeDecisao.Exercicios;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {

        int idade;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        idade = scanner.nextInt();

        if(idade >=18){
            System.out.println("Acesso liberado!!");
        }
        else{
            System.out.println("Acesso negado...");
        }
    }
}
