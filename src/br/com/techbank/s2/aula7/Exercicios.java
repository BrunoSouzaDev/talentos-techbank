package br.com.techbank.s2.aula7;

import java.util.*;
import java.util.stream.Collectors;

public class Exercicios {

    public static void validaInputInt(Scanner sc){
        if(!sc.hasNextInt()){
            System.out.println("Você precisa informar um número do tipo inteiro.");
            System.exit(1);
        }
    }

    public static List<Integer> getList(Scanner in){
        List<Integer> integerList = new ArrayList<>();
        String resposta = "S";

        while(resposta.equalsIgnoreCase("S")){
            System.out.println("Escreva um número para adicioná-lo ã lista:");
            validaInputInt(in);
            integerList.add(in.nextInt());

            System.out.println("Deseja continuar? Digite 'S', ou tecle qualquer coisa para sair.");
            resposta = in.next();
        }

        return integerList;
    }

    public static void exercicio1() {
        //Escreva um algoritmo que leia números insira em um array e após mostre os números informados na tela.

        Scanner in = new Scanner(System.in);
        List<Integer> integerList = getList(in);
        in.close();

        System.out.println(String.format("Programa encerrado. \nSua lista com %d elementos:", integerList.size()));
        integerList.forEach(value -> System.out.print(String.format("%d ", value)));
    }

    public static void exericio1_Anderson(){
        Scanner in = new Scanner(System.in);
        int[] numeros = new int[5];

        for(int i = 0; i<5; i++){
            System.out.println("Escreva um número para adicioná-lo ã lista:");
            validaInputInt(in);
            numeros[i]=in.nextInt();
        }

        System.out.println(Arrays.toString(numeros));
        //ou
        Arrays.asList(numeros).forEach(value -> System.out.print(String.format("%d ", value)));
    }

    public static void exercicio2(){
        /*
        Escreva um algoritmo que leia números, insira em um array e após mostre a quantidade de números negativos.
         */

        Scanner in = new Scanner(System.in);
        List<Integer> integerList = getList(in);
        in.close();

        List<Integer> negativelist = integerList.stream().filter(value -> value < 0).collect(Collectors.toList());

        System.out.println(String.format("Programa encerrado. \nSua lista de negativos com %d elementos:", negativelist.size()));
        negativelist.forEach(value -> System.out.print(String.format("%d ", value)));

        in.close();
    }

    public static void exercicio3(){
        /*
        Escreva um algoritmo que leia números, insira em um array e após mostre a quantidade de números pares.
         */
        Scanner in = new Scanner(System.in);
        List<Integer> integerList = getList(in);
        in.close();

        List<Integer> evenList = integerList.stream().filter(value -> value%2 == 0).collect(Collectors.toList());

        System.out.println(String.format("Programa encerrado. \nSua lista de pares com %d elementos:", evenList.size()));
        evenList.forEach(value -> System.out.print(String.format("%d ", value)));

        in.close();

    }

    public static void exercicio4(){
        /*
        Escreva um algoritmo que leia números, insira em um array e após mostre o maior valor.
         */
        Scanner in = new Scanner(System.in);
        List<Integer> integerList = getList(in);
        in.close();

        Integer max = integerList.stream().max(Integer::compare).get();
        System.out.println(String.format("O maior valor é %d", max));


        //outras maneiras de achar o maximo
        Integer max3 = Collections.max(integerList);
        Integer max2 = integerList.stream().mapToInt(V -> V).max().getAsInt();
    }

    public static void exercicio5(){
        /*
        Escreva um algoritmo que simula um jogo da forca simples.
        o usuario precisara adivinhar uma palavra chutando cada letra em no máximo 10 chutes,
        caso o usuario acerte a letra o jogo dirá que ele acertou, caso tenha errado,
        o numero de tentativas vai diminuindo. Caso o numero de tentativas chegue a 0 o usuário perde.
         */

        List<Integer> integerList = new ArrayList<>();
        Long acertos = 0l;

        Scanner in = new Scanner(System.in);
        List<String> palavra = new ArrayList<>(Arrays.asList("B","A","N","A","N","A"));
        Long letrasDistintas = palavra.stream().distinct().count();

        for(int i=0; i<10; i++){
            System.out.println("Chute uma letra:");
            String chute = in.next();
            if(palavra.contains(chute.toUpperCase())){
                System.out.println("Você acertou!");
                acertos++;
            }else{
                System.out.println("Você errou!");
            }

            if(acertos == letrasDistintas){
                break;
            }
        }

        if(acertos >= letrasDistintas){
            System.out.println(String.format("Você venceu a forca! A palavra era %s.", palavra.toString()));
        }else{
            System.out.println("Você perdeu!");
        }
    }

    public static void exercicio5_Anderson(){
        String palavra = "banana";
        String[] palavraSplitada = palavra.split("");
        char[] palavraSplitada_char = palavra.toCharArray();

        Scanner in = new Scanner(System.in);
        in.next().charAt(0);
    }

    public static void main(String[] args) {
        //exercicio1();
        //exercicio2();
        //exercicio3();
        //exercicio4();
        exercicio5();
    }
}
