package br.com.techbank.s1.aula6;

public class Main {

    public static void main(String[] args) {

        int valor = 10;

        //+++ arrays +++
        double saldoConta = 10;
        double saldoConta2 = 20;
        double saldoConta3 = 30;

        double[] arraySaldo = new double[10];
        arraySaldo[0] = 10;
        arraySaldo[0] = 20;
        arraySaldo[0] = 30;

        double[] arraySaldo2 = {10,20,30};

        for(int i=0; i<arraySaldo2.length; i++){
            System.out.println(arraySaldo2[i]);
        }

    }
}
