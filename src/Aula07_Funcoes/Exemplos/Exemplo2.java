package Aula07_Funcoes.Exemplos;

public class Exemplo2 {
    public static void main(String[] args) {
        funcaoComParametroSemRetorno(5, "Teste");
        Exemplo1.funcaoSemParametroSemRetorno();
    }
    static void funcaoComParametroSemRetorno(int parametro1, String parametro2){
        System.out.println("Parametro 1 = " + parametro1);
        System.out.println("Parametro 2 = " + parametro2);
    }
}
