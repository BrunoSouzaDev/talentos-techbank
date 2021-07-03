package br.com.techbank.s1_aula4;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static int metodoRecursivo(int i){
        if(i<10){
            return metodoRecursivo(i+1);
        }
        return i;
    }


    public static void main(String[] args) {

        int contagem = 1;

        System.out.println("While");
        while (contagem < 11) {
            System.out.print(contagem);
            contagem++;
        }

        System.out.println("Do While");
        do {
            System.out.println(contagem);
        } while (contagem < 11);

        System.out.println("For");
        for (int i = 0; i < 10; i++) {
            System.out.print(i);
        }

        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);

        System.out.println("ForEach");
        integerList.forEach(item -> {
            System.out.println(item);
        });

        System.out.println("ForOf");
        for(Integer item : integerList){
            System.out.println(item);
        }

        //Método recursivo
        System.out.println(metodoRecursivo(1));

    }
}
