package br.com.techbank.s1.aula5;

import java.util.Scanner;

public class Revisao {

    public static void validaInputLong(Scanner sc){
        if(!sc.hasNextLong()){
            System.out.println("Você precisa informar um número do tipo inteiro.");
            System.exit(1);
        }
    }

    public static void validaInputInt(Scanner sc){
        if(!sc.hasNextInt()){
            System.out.println("Você precisa informar um número do tipo inteiro.");
            System.exit(1);
        }
    }

    public static void exercicio1() {
        // Faça um programa que calcula o exponencial a partir de sua base e sua potencia
        // Por exemplo, 2 elevado 3 = 8

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro para a base: ");
        validaInputLong(sc);
        long base = sc.nextLong();
        long resultado = base;

        System.out.print("Digite um número inteiro para o expoente: ");
        validaInputInt(sc);
        int exp = sc.nextInt();
        sc.close();

        for(int i = 1; i<exp; i++){
            resultado *= base;
        }

        System.out.println(String.format("O resultado da potenciação é %d", resultado));
    }

    public static void exercicio2(){
        //padrao1
        for(int i = 0; i < 4; i++){
            for(int f = 0; f < 10; f++){
                System.out.print("*");
            }
            System.out.println("");
        }

        System.out.println("");

        //padrao2
        for(int i = 0; i < 5; i++){
            for(int f = 0; f <= i; f++){
                System.out.print("* ");
            }
            System.out.println("");
        }

        System.out.println("\n");


        //padrao3
        int linhas = 5;

        for(int i = 1; i <= linhas; i++){
            int k = linhas - i;

            while(k > 0){
                System.out.print("  ");
                k--;
            }

            for(int j = 1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }

        System.out.println("\n");

        //padrao4
        linhas = 5;
        System.out.println("PADRÃO 4");
        for (int i = 1; i <= linhas; i++) {

            int espacos = linhas - i;

            while (espacos > 0) {
                System.out.print("  ");
                espacos--;
            }

            int k = 0;
            while (k != 2 * i - 1) {
                System.out.print("* ");
                k++;
            }

            System.out.print("\n");
        }


        System.out.println("\n");

        //padrao5
        System.out.println("PADRÃO 5");
        for (int i = 1; i <= linhas; i++) {

            int espacos = linhas - i;

            while (espacos > 0) {
                System.out.print("  ");
                espacos--;
            }

            int k = 0;
            while (k != 2 * i - 1) {
                System.out.print(i+" ");
                k++;
            }

            System.out.print("\n");
        }

        System.out.print("\n");

        //padrao6
        System.out.println("PADRÃO 6");
        for (int i = 1; i <= linhas; i++) {

            int espacos = linhas - i;

            while (espacos > 0) {
                System.out.print("  ");
                espacos--;
            }

            int k = 0;
            int l = i;
            boolean decrement = true;
            while (k != 2 * i - 1) {
                System.out.print(l+" ");
                k++;
                if(l > 1 && decrement){
                    --l;
                } else {
                    decrement = false;
                    ++l;
                }
            }
            System.out.print("\n");
        }
    }


        public static void exercicio2VI(){
            Scanner sc=new Scanner(System.in);
            System.out.print("Entre com quantidades de números:");
            int rows=sc.nextInt();
            System.out.println("");
            for (int i=1; i<=rows; i++){
                for (int j=1; j<=(rows-i)*2; j++){
                    System.out.print(" ");
                }
                for (int k=i; k>=1; k--){
                    System.out.print(" "+k);
                }
                for (int l=2; l<=i; l++){
                    System.out.print(" "+l);
                }
                System.out.println();
            }
        }


    public static void main(String[] args) {
        //exercicio1();
        exercicio2();
        exercicio2();
    }
}
