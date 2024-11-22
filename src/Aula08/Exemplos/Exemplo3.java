package Aula08.Exemplos;

import java.io.*;

public class Exemplo3 {
    public static void main(String[] args) {
        File arquivo = new File("C:\\Users\\Aluno\\Documents\\Sebastian\\arquivo.txt");

        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(arquivo));
            bufferedWriter.write("novo texto a ser gravado");
            bufferedWriter.close();

            BufferedReader bufferedReader = new BufferedReader(new FileReader(arquivo));
            String linha;
            while ((linha = bufferedReader.readLine()) != null){
                System.out.println(linha);
            }
            bufferedReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
