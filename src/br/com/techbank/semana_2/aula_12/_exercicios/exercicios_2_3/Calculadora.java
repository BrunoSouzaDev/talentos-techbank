package br.com.techbank.semana_2.aula_12._exercicios.exercicios_2_3;

public class Calculadora {

    public static double somar(double a, double b){
        return a+b;
    }

    public static double subtrair(double a, double b){
        return a-b;
    }

    public static double multiplicar(double a, double b){
        return a*b;
    }

    public static double dividir(double a, double b){
        if(b !=0){
            return a/b;
        }
        throw new RuntimeException("Valor não pode ser dividido por zero!");
    }

    public static double fatorial(double a){
        double fatorial = 1;

        if(a==0){
            return 1d;
        }else{
            for (int i = (int) a; i >0; i--) {
                fatorial*=i;
            }
            return fatorial;
        }
    }
}
