package br.com.techbank.aula3;

import java.util.Scanner;

public class Exercicios {

    public static void validaInputInt(Scanner sc){
        if(!sc.hasNextInt()){
            System.out.println("Você precisa informar um número do tipo inteiro.");
            System.exit(1);
        }
    }


    public static void exercicio1(){
        /*Construa um algoritmo que leia 10 valores inteiros e positivos e:
        Encontre o maior valor
        Encontre o menor valor
        Calcule a média dos números lidos Esse exercício foi dado na aula 3
        e agora vamos otimizar ele utilizando o while e for.
         */

        Scanner sc = new Scanner(System.in);

        int menor = 0;
        int maior = 0;
        int soma = 0;

        for(int i=0; i<10;i++){
            System.out.print("Digite um número inteiro: ");
            validaInputInt(sc);
            int a = sc.nextInt();

            if(i==0 || a > maior){
                maior = a;
            }

            if(i==0 || a < menor){
                menor = a;
            }

            soma += a;
            System.out.println("Número armazenado!");
        }

        double media = soma/10.0;

        System.out.println("O menor valor é "+menor);
        System.out.println("O maior valor é "+maior);
        System.out.println("A média é "+media);

        sc.close();
   }

    public static void exercicio2(){
        //Construa um algoritmo usando uma estrutura de repetição que calcule o fatorial de um número.
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro e POSITIVO: ");
        validaInputInt(sc);
        int a = sc.nextInt();
        double fatorial = 1;
        sc.close();

        if(a>0){
            while(a >= 1){
                fatorial *= a;
                a -=1;
            }
        } else if(a<0) {
            System.out.println("Você deve digitar um número positivo. Fechando o programa.");
            System.exit(1);
        }

        System.out.println(String.format("O fatorial deste número é %.0f", fatorial));

    }

    public static void main(String[] args) {
        //exercicio1();
        exercicio2();
    }
}
