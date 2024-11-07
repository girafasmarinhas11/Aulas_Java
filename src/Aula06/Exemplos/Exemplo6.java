package Aula06.Exemplos;

public class Exemplo6 {
    public static void main(String[] args) {
        int[][] matrizNumeros = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        for (int i = 0; i < matrizNumeros.length; i++){
            for (int j = 0 ; j < matrizNumeros[0].length ; j++){
                System.out.println(matrizNumeros[i][j]);
            }
        }

        int i  = 0;
    }
}
