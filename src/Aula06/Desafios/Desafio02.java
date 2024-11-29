package Aula06.Desafios;

import java.util.Scanner;

public class Desafio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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
        int opcao = 0;
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
        System.out.println("marola");
    }
    public static void cadastrarUsuario(){
        System.out.println("produto");
    }
    public static void atualizarUsuario(){
        System.out.println("marroquina");
    }
    public static void  deletarUsuario(){
        System.out.println("maconha");
    }
}
