package Aula08_ManipulacaoArq.Exemplos;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Exemplo2 {
    public static void main(String[] args) {
        File arquivo = new File("src\\Aula08_ManipulacaoArq\\Exemplos\\arquivo.txt");

        if (arquivo.exists()) {
            System.out.println("O arquivo já existe!");
        } else {
            try {
                // Cria o arquivo
                if (arquivo.createNewFile()) {
                    System.out.println("Arquivo criado com sucesso: " + arquivo.getName());
                } else {
                    System.out.println("Falha ao criar o arquivo.");
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
