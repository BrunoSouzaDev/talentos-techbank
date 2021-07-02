package br.com.techbank.aula2;

import java.util.Scanner;

public class Exercicios {

    public static void validaInputInt(Scanner sc){
        if(!sc.hasNextInt()){
            System.out.println("Você precisa informar um número do tipo inteiro.");
            System.exit(1);
        }
    }

    public static void validaInputDouble(Scanner sc){
        if(!sc.hasNextDouble()){
            System.out.println("Você precisa informar um número do tipo double.");
            System.exit(1);
        }
    }

    public static void exercicio1(){
        //Escreva um algoritmo que leia um número inteiro e diga se ele é par ou ímpar.

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");

        validaInputInt(sc);

        int a = sc.nextInt();

        String mensagem = a%2==0 ?
                  String.format("O número %d é par.", a)
                : String.format("O número %d é ímpar.", a);

        System.out.println(mensagem);
        sc.close();

    }

    public static void exercicio2(){
        /*Elabore um algoritmo que dada a idade de um nadador classifique-o em uma das seguintes categorias:
        Infantil A = 5 a 7 anos
        Infantil B = 8 a 11 anos
        Juvenil A = 12 a 13 anos
        Juvenil B = 14 a 17 anos
        Adultos = Maiores de 18 anos*/

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a idade do nadador: ");

        validaInputInt(sc);

        int idade = sc.nextInt();

        if(idade >=5 && idade<= 7){
            System.out.println("Nadador Infantil A!");
        }else if(idade >=8 && idade<= 11){
            System.out.println("Nadador Infantil B!");
        }else if(idade >=12 && idade<= 13) {
            System.out.println("Nadador Juvenil A!");
        }else if(idade >=14 && idade<= 17){
            System.out.println("Nadador Juvenil B!");
        }else if(idade >17){
            System.out.println("Nadador Adulto!");
        } else {
            System.out.println("Nadador jovem demais! Não há categoria.");
        }

        sc.close();

    }

    public static void exercicio3(){
        //Escreva um algoritmo em Java que leia dois números inteiros e determine qual é o menor.
        // Escreva um algoritmo que determina o maior também.
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        validaInputInt(sc);
        int a = sc.nextInt();

        System.out.print("Digite outro número inteiro: ");
        validaInputInt(sc);
        int b = sc.nextInt();

        if(a<b){
            System.out.println(a+" é o menor número.");
            System.out.println(b+" é o maior número.");
        } else if(b<a) {
            System.out.println(b+" é o menor número.");
            System.out.println(a+" é o maior número.");
        } else {
            System.out.println("Os números são iguais.");
        }

        sc.close();
    }

    public static void exercicio4(){
        /*Construa um algoritmo que leia 10 valores inteiros e positivos e:
            Encontre o maior valor
            Encontre o menor valor
            Calcule a média dos números lidos*/
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

    public static void exercicio5(){
        /*Escreva um algoritmo em Java que seja capaz de fazer as seguintes
        operações matemáticas (adição, subtração, multiplicação e divisão).
        Todas as operações serão entre dois valores.
        No começo do algoritmo pergunte ao usuário qual operação ele deseja fazer e quais são os valores.
        * */

        Scanner sc = new Scanner(System.in);
        System.out.println("Qual operação deseja fazer?\n" +
                "1) Adição \n" +
                "2) Subtração\n" +
                "3) Divisão \n" +
                "4) Multiplicação ");

        validaInputInt(sc);
        int operacao = sc.nextInt();

        if(operacao!=1 && operacao!=2 && operacao!=3 && operacao!=4){
            System.out.println("Você precisa informar uma operação válida..");
            System.exit(1);
        }

        System.out.print("Digite um número: ");
        validaInputDouble(sc);
        double a = sc.nextDouble();

        System.out.print("Digite outro número: ");
        validaInputDouble(sc);
        double b = sc.nextDouble();

        double resultado = 0;

        if(operacao == 1) {
            resultado = a+b;
        }else if(operacao == 2){
            resultado = a-b;
        }else if(operacao == 3 && b!=0){
            resultado = a/b;
        }else if(operacao == 4){
            resultado = a*b;
        } else {
            System.out.println("Não é uma operação válida.");
        }

        System.out.println("O resultado é: "+resultado);
        sc.close();
    }

    public static void exercicio6(){
        /*Faça a implementação do Jogo Pedra, Papel e Tesoura (Jokempô).
        O algoritmo deverá perguntar qual é a escolha do jogador 1 (Pedra [pe], Papel [pa],
        Tesoura [t]) e deverá fazer o mesmo para o jogador 2.
        No final da execução o algoritmo deverá dizer qual é o jogador vencedor ou se houve empate.
        * */
        Scanner sc = new Scanner(System.in);
        System.out.println("Jokempô!! Jogador 1, escolha sua jogada: \n" +
                "pe) Pedra \n" +
                "pa) Papel\n" +
                "t) Tesoura");

        String pedra = "pe", papel = "pa", tesoura = "t";
        String jogo = sc.next();
        validaJogo(jogo);

        System.out.println("Jokempô!! Jogador 2, escolha sua jogada: \n" +
                "pe) Pedra \n" +
                "pa) Papel\n" +
                "t) Tesoura");

        String jogo2 = sc.next();
        validaJogo(jogo2);

        System.out.println("Jogador 1 jogou: "+jogo);
        System.out.println("Jogador 2 jogou: "+jogo2);


        if(jogo.equals(jogo2)){
            System.out.println("Houve empate.");
        } else if((jogo.equals(papel) && jogo2.equals(pedra)) ||
                (jogo.equals(pedra) && jogo2.equals(tesoura)) ||
                (jogo.equals(tesoura) && jogo2.equals(papel))){
            System.out.println("O jogador 1 venceu");
        } else {
            System.out.println("O jogador 2 venceu");
        }

        sc.close();
    }

    public static void validaJogo(String jogo){
        if(!jogo.equals("pe") && !jogo.equals("pa") && !jogo.equals("t")){
            System.out.println("Não é um jogo válido.");
            System.exit(1);
        }
    }

    public static void main(String[] args) {
        //exercicio1();
        //exercicio2();
        //exercicio3();
        //exercicio4();
        //exercicio5();
        exercicio6();
    }

}
