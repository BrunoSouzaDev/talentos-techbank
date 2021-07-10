package br.com.techbank.semana_2.aula_10.exercicio;

import java.util.Scanner;

public class Validator {

    public static void validaInputInt(Scanner sc){
        if(!sc.hasNextInt()){
            System.out.println("Você precisa informar um número do tipo inteiro.");
            System.exit(1);
        }
    }

    public static void validaInputFloat(Scanner sc){
        if(!sc.hasNextFloat()){
            System.out.println("Você precisa informar um número do tipo inteiro.");
            System.exit(1);
        }
    }

    public static boolean validaMaxContatos(Integer qtContatos, Agenda agenda){
        Integer vagas = 10 - agenda.getContatos().size();
        if(qtContatos > vagas){
            System.out.println(String.format("Sua lista só pode ter 10 contatos. Vocë dispõe de %d lugares.", vagas));
            return true;
        }
        return false;
    }
}
