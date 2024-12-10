package Aula06_VetoresMatrizes.Desafios;

import java.util.Arrays;
import java.util.Scanner;

public class Desafio02 {

    static Scanner scanner = new Scanner(System.in); /*variável global - produz efeito sobre as demais linhas do código*/
    static String[] cabecalho = {"Id","Nome","Telefone","Email"};
    static String[][] matrizCadastro = {{"",""}}; /*"banco de dados"*/

    public static void main(String[] args) {
        matrizCadastro[0] = cabecalho;

        String menu = """
                ________________________________________________
                |Escolha uma opção:                            |
                |    1- Exibir Cadastro Completo               |
                |    2- Inserir novo usuário                   |
                |    3- Atualizar cadastro por id              |
                |    4- Deletar um cadastro por id             |
                |    5- Sair                                   |
                |______________________________________________|
                """;
        int opcao;

        do{
            System.out.println(menu);
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao){
                case 1:
                    exibirUsuario();
                    break;
                case 2:
                    cadastrarUsuario();
                    break;
                case 3:
                    atualizarUsuario();
                    break;
                case 4:
                    deletarUsuario();
                    break;
                case 5:
                    System.out.println("Fim do programa!");
                    break;
                default:
                    System.out.println("Opção Inválida!");
            }
        }
        while(opcao!=5);
    }
    public static void exibirUsuario(){
        StringBuilder tabela = new StringBuilder();
        for(String[] linhas: matrizCadastro){
            for (int coluna = 0; coluna < matrizCadastro[0].length; coluna++){
                int tamanhoColuna = coluna == 0 ? 5 : (coluna == 2? 10 : 25);
                tabela.append(String.format("%-"+ tamanhoColuna +"s | ", linhas[coluna]));
            }
            tabela.append("\n") ;
        }
        System.out.println(tabela);
    }
    public static void cadastrarUsuario(){
        System.out.println("Quantas pessoas você deseja cadastrar: ");
        int qtdePessoas = scanner.nextInt();
        scanner.nextLine();
        String[][] novaMatriz = new String[matrizCadastro.length + qtdePessoas][cabecalho.length];

        for (int linhas = 0; linhas < matrizCadastro.length; linhas++){
            novaMatriz[linhas] = Arrays.copyOf(matrizCadastro[linhas], matrizCadastro[linhas].length);
        }

        for(int linhas = matrizCadastro.length; linhas < novaMatriz.length; linhas++){
            System.out.println("Preencha as informações a seguir: ");
            System.out.println(cabecalho[0] +" - " +  linhas);
            novaMatriz[linhas][0] = String.valueOf(linhas);

            for(int coluna = 1; coluna < cabecalho.length; coluna++){// converte valor inteiro para o String
                System.out.print(cabecalho[coluna] + ": ");
                novaMatriz[linhas][coluna] = scanner.nextLine();
            }
        }

        matrizCadastro = novaMatriz;
    }

    public static void atualizarUsuario(){
        exibirUsuario();

        System.out.println("\nDigite o id do usuário que deseja atualizar:");
        int idEscolhido = scanner.nextInt();
        scanner.nextLine();

        System.out.println(cabecalho[0] + idEscolhido);
        for(int coluna = 1; coluna < cabecalho.length; coluna++){
            System.out.println(cabecalho[coluna] + ": ");
            matrizCadastro[idEscolhido][coluna] = scanner.nextLine();
        }
        exibirUsuario();
    }

    public static void  deletarUsuario(){

        System.out.println("2");
    }
}
