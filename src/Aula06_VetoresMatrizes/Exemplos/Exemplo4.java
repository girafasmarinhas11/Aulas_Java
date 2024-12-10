package Aula06_VetoresMatrizes.Exemplos;

public class Exemplo4 {
    public static void main(String[] args) {
        int[][] matrizNumeros = {
                {1,2,3},
                {4,5,6},
                {7,8,9} };

        System.out.println("Valor da posição [2][1] = " + matrizNumeros[2][1]);

        String[][] matrizNomes = {{"Sebas","Toby"},{"Raphael", "Marcelo"}};

        System.out.println("Valor da posição [1][0] = " + matrizNomes[1][0]);

    }
}
