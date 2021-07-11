package br.com.techbank.semana_2.aula_12._exercicios;

import java.util.Scanner;

public class Validator {

    public static void validaInputInt(Scanner sc){
        if(!sc.hasNextInt()){
            System.out.println("Você precisa informar um número do tipo inteiro.");
            System.exit(1);
        }
    }

    public static void validaInputDouble(Scanner sc){
        if(!sc.hasNextDouble()){
            System.out.println("Você precisa informar um número do tipo inteiro.");
            System.exit(1);
        }
    }

}
