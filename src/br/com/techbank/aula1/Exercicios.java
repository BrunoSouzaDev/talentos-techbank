package br.com.techbank.aula1;

import java.util.Scanner;

public class Exercicios {

    public static void main(String[] args) {
        //exercicio1();
        //exercicio2();
        //exercicio3();
        exercicio4();
    }

    public static void exercicio1(){
        int y = 99;
        int z = 11;
        int temp = z;

        System.out.println("valor inicial y: "+y);
        System.out.println("valor inicial z: "+z);

        z= y;
        y = temp;

        System.out.println("valor final y: "+y);
        System.out.println("valor final z: "+z);

        short a = 1, b = 5, c = 3, d = 0;
        System.out.println(c);

    }

    public static void exercicio2(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor para receber de volta seu antecessor: ");
        int integer = scanner.nextInt();
        System.out.println("O antecessor é: "+(--integer));
        scanner.close();
    }

    public static void exercicio3(){
        //Escreva um algoritmo para ler as dimensões de um retângulo (base e altura),
        //calcular e escrever a área do retângulo.

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor da base do retângulo: ");
        int b = sc.nextInt();

        System.out.print("Digite o valor da altura do retângulo: ");
        int h = sc.nextInt();

        System.out.println("A área do seu retângulo é: "+(b*h));

        sc.close();

    }

    public static void exercicio4(){
        //Escreva um algoritmo para ler o número total de eleitores de um município,
        // o número de votos brancos, nulos e válidos.
        // Calcular e escrever o percentual que cada um representa em relação ao total de eleitores.
        Scanner sc = new Scanner(System.in);

        System.out.print("Escreva o número total de eleitores do município: ");
        int eleitores = sc.nextInt();

        System.out.print("Escreva o número total de votos brancos: ");
        int brancos = sc.nextInt();

        System.out.print("Escreva o número total de votos nulos: ");
        int nulos = sc.nextInt();

        System.out.print("Escreva o número total de votos válidos: ");
        int validos = sc.nextInt();


        double pcBrancos = brancos * 100 /eleitores;
        double pcNulos = nulos * 100 /eleitores;
        double pcValidos = validos * 100 /eleitores;

        System.out.println("O percentual de votos brancos é " + pcBrancos +"%, \n" +
                "O percentual de votos nulos é " + pcNulos +"%, \n" +
                "O percentual de votos válidos é " + pcValidos +"%, \n");

        sc.close();

    }
}
