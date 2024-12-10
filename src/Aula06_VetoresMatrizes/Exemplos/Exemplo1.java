package Aula06_VetoresMatrizes.Exemplos;

public class Exemplo1 {
    public static void main(String[] args) {
        int[] numero = new int[5];

        numero[0] = 10;
        numero[1] = 20;
        numero[2] = 30;
        numero[3] = 40;
        numero[4] = 50;
        /*caso o valor da matriz não esteja declarado, será dado valor 0*/

        System.out.println(numero[0]);

        String[] nomes = new String[4];

        nomes[0] = "Sebas";
        nomes[1] = "Julia";
        nomes[2] = "Ana";
        nomes[3] = "Louisy";

        System.out.println(nomes[3]);



    }
}
