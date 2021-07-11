package br.com.techbank.semana_2.aula_11.exercicios_opcionais.televisao;

import java.util.Scanner;

import static br.com.techbank.semana_2.aula_11.exercicios_opcionais.Validator.*;

public class Main {
    public static void main(String[] args) {
        /*
        Crie uma classe Televisão e uma classe ControleRemoto que pode controlar
        o volume e trocar os canais da televisão.

         */
            System.out.println("Bem-vinda(o) ao app minha televisão! :)");
            ControleRemoto controle = new ControleRemoto();

            Scanner in = new Scanner(System.in);
            textoMenu();
            int opcao = in.nextInt();

            do {
                opcao = menu(opcao, in, controle);
            } while(opcao != 9);

            in.close();
            controle.desligar();
            System.out.println("Televisão desligada.");
            System.exit(0);
        }

    private static void textoMenu(){
        System.out.println("\n");
        System.out.println("O que deseja fazer? Selecione uma opção:");
        System.out.println(
                "1) Ligar\n"+
                "2) Aumentar volume\n"+
                "3) Diminuir volume\n"+
                "4) Aumentar canal\n"+
                "5) Diminuir canal\n"+
                "6) Trocar canal\n" +
                "7) Consultar volume\n" +
                "8) Consultar Canal\n" +
                "9) Desligar");
    }

    private static int menu(int opcao, Scanner in, ControleRemoto controle){

        switch(opcao){
            case 1:
                controle.ligar();
                System.out.println("Televisão ligada.");
                break;
            case 2:
                controle.aumentarVolume();
                System.out.println("Volume aumentado!");
                break;
            case 3:
                controle.diminuirVolume();
                System.out.println("Volume diminuido!");
                break;
            case 4:
                controle.aumentarCanal();
                System.out.println("Canal aumentado!");
                break;
            case 5:
                controle.diminuirCanal();
                System.out.println("Canal diminuido!");
                break;
            case 6:
                System.out.println("Digite um canal: ");
                int canal = in.nextInt();
                controle.trocarCanal(canal);
                break;
            case 7:
                controle.consultarVolume();
                break;
            case 8:
                controle.consultarCanal();
                break;
            default:
                System.out.println("Vocë não digitou uma opçáo válida! Programa encerrado.");
                controle.desligar();
                System.exit(1);
                break;
        }

        textoMenu();
        validaInputInt(in);
        return in.nextInt();
    }
}
