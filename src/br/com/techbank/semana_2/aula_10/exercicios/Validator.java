package br.com.techbank.semana_2.aula_10.exercicios;

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
}
