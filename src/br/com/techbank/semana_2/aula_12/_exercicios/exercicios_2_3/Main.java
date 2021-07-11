package br.com.techbank.semana_2.aula_12._exercicios.exercicios_2_3;
import java.util.Scanner;

import static br.com.techbank.semana_2.aula_12._exercicios.Validator.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bem-vinda(o) ao app minha calculadora! :)");

        Scanner in = new Scanner(System.in);
        textoMenu();
        int opcao = in.nextInt();

        do {
            opcao = menu(opcao, in);
        } while (opcao != 5);

        in.close();
        System.exit(0);
    }

    private static double getNumero(Scanner in){
        System.out.println("Digite o valor do número:");
        validaInputDouble(in);
        return in.nextDouble();
    }

    private static void textoMenu() {
        System.out.println("\n");
        System.out.println("O que deseja fazer? Selecione uma opção:");
        System.out.println(
                "1) Somar\n" +
                        "2) Subtrair\n" +
                        "3) Multiplicar\n" +
                        "4) Dividir\n" +
                        "5) Fatorial\n" +
                        "6) Sair\n");
    }

    private static int menu(int opcao, Scanner in) {

        double resultado = 0;
        double a;
        double b;
        switch (opcao) {
            case 1:
                a = getNumero(in);
                b = getNumero(in);
                resultado = Calculadora.somar(a,b);
                break;
            case 2:
                a = getNumero(in);
                b = getNumero(in);
                resultado = Calculadora.subtrair(a,b);
                break;
            case 3:
                a = getNumero(in);
                b = getNumero(in);
                resultado = Calculadora.multiplicar(a,b);
                break;
            case 4:
                a = getNumero(in);
                b = getNumero(in);
                resultado = Calculadora.dividir(a,b);
                break;
            case 5:
                a = getNumero(in);
                resultado = Calculadora.fatorial(a);
                break;
            default:
                System.out.println("Vocë não digitou uma opçáo válida! Programa encerrado.");
                System.exit(1);
                break;
        }

        System.out.println(String.format("Resultado: %s", resultado));
        textoMenu();
        validaInputInt(in);
        return in.nextInt();
    }
}
