package Aula02.Exemplos;

import java.util.Scanner;

public class Exemplo8 {
    public static void main(String[] args) {
        String texto = "Este texto esta na primeira linha\n Este teto esta na segunda linha" + "\n\tEste texto está na terceira linha e com tabulação";

        System.out.println(texto);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt(); // esse comando serve para consumir o /n que o nextInt deixou na memória
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Seu nome é " + nome + "e sua idade é " + idade); // aaaabsss
    }
}
