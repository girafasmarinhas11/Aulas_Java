package Aula05_EstruturaDeRepeticao.Exercicios;

public class Exercicio02 {
    public static void main(String[] args) {

        int total = 0;
        int num = 1;

        while (num <= 100)
        {
            if(num % 2 ==0){
                total += num;
                System.out.println("var total: " + num);
            }
            num = num + 1;
        }
        System.out.println("final: " + total);
    }
}
