package br.com.techbank.semana_2.aula_11.exercicios_opcionais;

import java.util.Scanner;

public class Validator {

    public static void validaInputInt(Scanner sc){
        if(!sc.hasNextInt()){
            System.out.println("Você precisa informar um número do tipo inteiro.");
            System.exit(1);
        }
    }

    public static void validaInputNegativo(int input){
        if(input < 0){
            System.out.println("Você precisa informar um número maior do que 0.");
            System.exit(1);
        }
    }



}
