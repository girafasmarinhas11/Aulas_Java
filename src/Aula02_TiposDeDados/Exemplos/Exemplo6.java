package Aula02_TiposDeDados.Exemplos;
import java.util.Scanner;

public class Exemplo6   {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digitar um número inteiro");
        int varInt = scanner.nextInt();
        long varLong = varInt;
        float varFloat = varInt;

        System.out.println("O número inteiro digitado é: " + varInt);
        System.out.println("varLong = " + varLong);
        System.out.println("varFloat = " + varFloat);

        System.out.println("Digitar um número decimal: ");
        varFloat = scanner.nextFloat();
        System.out.println("O número decimal digitado é  " + varFloat);

        scanner.close();
    }
}
