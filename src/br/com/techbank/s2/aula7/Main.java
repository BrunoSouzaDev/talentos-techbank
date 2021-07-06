package br.com.techbank.s2.aula7;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        /*
        BOXED
         */

        Integer i = 0;
        Short s = 0;
        Long l = 0L;
        Float f = 0f;
        Character c = 'a';
        String str = "";

        /*
        COLLECTIONS
         */

        //LIST
        List<Integer> lista = new ArrayList<>();
        List<Integer> listaDeArray = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));
        List<Integer> listaDeArrayDir = Arrays.asList(1,2,3,4,5,6,7,8);

        lista.add(10);

        //boxing com lambda
        int[] vetor = {1,2,3,4,5,6};
        List<Integer> listaInteiros = Arrays.stream(vetor).boxed().collect(Collectors.toList());

        //unboxing com lambda
        Integer[] vetorUnboxed = (Integer[]) listaInteiros.stream().toArray();

        listaInteiros.stream().forEach(nota -> System.out.println(nota));
        listaInteiros.forEach(nota -> System.out.println(nota));
        listaInteiros.forEach(System.out::println);

    }

}
