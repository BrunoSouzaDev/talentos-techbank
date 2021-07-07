package br.com.techbank.semana_2.aula_8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Desafio {

    public static void exercicioComAbs(){
        /*
        Dado um array de números inteiros com valores negativos e positivos, encontro o número mais próximo de zero.
        Se houver valores como 2 e -2, considere o número positivo.
         */

        List<Integer> lista = new ArrayList<>(Arrays.asList(78,89,3,45,2,32,12,-98,-32,-15,5,39,67,786,45,45,-2));

        Integer numeroProxZero = lista.get(0);
        for(Integer number : lista){
            if(Math.abs(number) < Math.abs(numeroProxZero)){
                numeroProxZero = number;
            } else if (Math.abs(number) == Math.abs(numeroProxZero)) {
                numeroProxZero = number > 0 ? number : numeroProxZero;
            }
        }

        System.out.println(String.format("O número mais próximo de zero é %d.", numeroProxZero));
    }

    public static void exercicioSemAbs(){
        List<Integer> lista = new ArrayList<>(Arrays.asList(78,89,3,45,2,32,12,-98,-32,-15,5,39,67,786,45,45,-2));

        Integer numeroProxZero = lista.get(0);
        for(Integer number : lista){
            Integer numberAbs = number < 0 ? number*-1 : number;
            Integer numeroProxZeroAbs = numeroProxZero < 0 ? numeroProxZero*-1 : numeroProxZero;

            if(numberAbs < numeroProxZeroAbs){
                numeroProxZero = number;
            } else if (numberAbs == numeroProxZeroAbs) {
                numeroProxZero = number > 0 ? number : numeroProxZero;
            }
        }

        System.out.println(String.format("O número mais próximo de zero é %d.", numeroProxZero));
    }


    public static void main(String[] args) {
        //exercicioComAbs();
        exercicioSemAbs();
    }
}
