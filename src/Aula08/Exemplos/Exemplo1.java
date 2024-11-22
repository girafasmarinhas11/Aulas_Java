package Aula08.Exemplos;

import java.io.File;
import java.io.IOException;

public class Exemplo1 {
    public static void main(String[] args) {
        File arquivo = new File("C:\\Users\\Aluno\\Documents\\Sebastian\\arquivo.txt");


        if (arquivo.exists()){
            System.out.println("O arquivo existe!");
        }
        else{
            try {
                if(arquivo.createNewFile()){
                    System.out.println("arquivo criado com sucesso! " + arquivo.getName());
                }
                else{
                    System.out.println("falha ao criar novo arquivo.");
                }
            }
            catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
