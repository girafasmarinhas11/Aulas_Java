package Aula07_Funcoes.Exemplos;

public class Exemplo3 {
    public static void main(String[] args) {
        int retorno = funcaoComParametroComRetorno(2,3);
        System.out.println(retorno);
    }
    private static int funcaoComParametroComRetorno (int num1, int num2){
        return num1 + num2;
    }
}
