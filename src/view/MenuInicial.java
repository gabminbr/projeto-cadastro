package view;

import java.util.Scanner;

public class MenuInicial {
    private static int resposta = 0;
    private static Scanner in = new Scanner(System.in);

    public static int inputMenu(){
        while(resposta <= 0){
            printMenu();
            resposta = Integer.valueOf(in.nextInt());
        }
        return resposta;
    }

    private static void printMenu(){
        System.out.println("1 - Cadastrar um novo pet");
        System.out.println("2 - Alterar os dados do pet cadastrado");
        System.out.println("3 - Deletar um pet cadastrado");
        System.out.println("4 - Listar todos os pets cadastrados");
        System.out.println("5 - Listar pets por algum critério (idade, nome, raça)");
        System.out.println("6 - Sair");
    }
}
