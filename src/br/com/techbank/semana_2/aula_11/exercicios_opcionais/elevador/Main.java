package br.com.techbank.semana_2.aula_11.exercicios_opcionais.elevador;

import java.util.Scanner;

import static br.com.techbank.semana_2.aula_11.exercicios_opcionais.Validator.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bem-vinda(o) ao app meu elevador! :)");

        Scanner in = new Scanner(System.in);
        Elevador elevador = criarElevador(in);

        textoMenu();
        int opcao = in.nextInt();

        do {
            opcao = menu(opcao, in, elevador);
        } while(opcao != 9);

        in.close();
        System.out.println("Prorama encerrado.");
        System.exit(0);
    }

    private static Elevador criarElevador(Scanner in){
        System.out.println("Vamos criar um elevador.");

        System.out.println("Digite o número de andares total do elevador:");
        validaInputInt(in);
        int andares = in.nextInt();
        validaInputNegativo(andares);

        System.out.println("Digite a capacidade máxima do elevador:");
        validaInputInt(in);
        int capacidade = in.nextInt();
        validaInputNegativo(capacidade);

        return new Elevador(andares, capacidade);
    }

    private static void textoMenu(){
        System.out.println("\n");
        System.out.println("O que deseja fazer? Selecione uma opção:");
        System.out.println(
                "1) Inicializar\n"+
                        "2) Entrar\n"+
                        "3) Sair\n"+
                        "4) Subir\n"+
                        "5) Descer\n"+
                        "6) Ver andar atual\n"+
                        "7) Ver Capacidade atual");;
    }

    private static int menu(int opcao, Scanner in, Elevador elevador){

        switch(opcao){
            case 1:
                System.out.println("Digite o número do andar atual do elevador:");
                validaInputInt(in);
                int andarAtual = in.nextInt();
                validaInputNegativo(andarAtual);

                System.out.println("Digite quantas pessoas estao no elevador:");
                validaInputInt(in);
                int capacidadeAtual = in.nextInt();
                validaInputNegativo(capacidadeAtual);


                elevador.inicializa(capacidadeAtual, andarAtual);
                System.out.println("Elevador inicializado.");
                break;
            case 2:
                elevador.entra();
                break;
            case 3:
                elevador.sai();
                break;
            case 4:
                elevador.sobe();
                break;
            case 5:
                elevador.desce();
                break;
            case 6:
                System.out.println(
                        String.format("O elevador está no andar %d.", elevador.getAndarAtual()));
                break;
            case 7:
                System.out.println(
                        String.format("Há %d pessoas no elevador agora.", elevador.getCapacidadeAtual()));
                break;
            default:
                System.out.println("Vocë não digitou uma opçáo válida! Programa encerrado.");
                System.exit(1);
                break;
        }

        textoMenu();
        validaInputInt(in);
        return in.nextInt();
    }
}
