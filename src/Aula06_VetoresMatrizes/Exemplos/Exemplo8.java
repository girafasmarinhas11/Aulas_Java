package Aula06_VetoresMatrizes.Exemplos;

public class Exemplo8 {
    public static void main(String[] args) {
        int[][] matrizNumeros = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        for (int[] matrizNumero : matrizNumeros) {
            for (int i : matrizNumero) {
                System.out.println(matrizNumero[i]);
            }
        }

        String[][] nomes = {{"Sebas","Toby"},{"Julia","Ana"}};

        for(String[] nome: nomes){
            for (String s : nome){
                System.out.println(s);
            }
        }
    }
}