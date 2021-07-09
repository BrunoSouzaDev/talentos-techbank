package br.com.techbank.semana_2.aula_7;

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


    public static void validaPalavra(String palavra){
        if (palavra.isEmpty() || palavra.contains(" ") || palavra.matches(".*\\d.*")) {
            System.out.println("Você digitou uma palavra inválida. Comece de novo.");
            System.exit(1);
        }
    }

    public static void validaQtLetrasDistintas(Long count){
        if(count > 10) {
            System.out.println("Há letras distintas demais. Comece de novo.");
            System.exit(1);
        }
    }

    public static List<String> breakPalavraForca(String palavra){
        String[] palavraSplitada = palavra.split("");
        List<String> palavraSplitadaList = Arrays.asList(palavraSplitada);
        return palavraSplitadaList;
    }

    public static void exercicio5(){
        /*
        Escreva um algoritmo que simula um jogo da forca simples.
        o usuario precisara adivinhar uma palavra chutando cada letra em no máximo 10 chutes,
        caso o usuario acerte a letra o jogo dirá que ele acertou, caso tenha errado,
        o numero de tentativas vai diminuindo. Caso o numero de tentativas chegue a 0 o usuário perde.
         */

        List<String> letrasChutadas = new ArrayList<>();
        Long acertos = 0l;

        Scanner in = new Scanner(System.in);
        System.out.println("Diga uma palavra para ser adivinhada na forca:");
        String palavra = in.next();
        validaPalavra(palavra);

        List<String> palavraQuebrada = breakPalavraForca(palavra.toUpperCase());
        Long letrasDistintas = palavraQuebrada.stream().distinct().count();
        validaQtLetrasDistintas(letrasDistintas);

        for(int i=10; i>0; i--) {
            System.out.println("Chute uma letra:");
            String chute = in.next();

            if(letrasChutadas.contains(chute)){
                System.out.println("Você já chutou essa letra. Chute outra.");
                i++;
            } else if (palavraQuebrada.contains(chute.toUpperCase())) {
                System.out.println("Você acertou!");
                letrasChutadas.add(chute);
                acertos++; i++;
            } else {
                System.out.println(String.format("Você errou! Vocë tem %d chutes.", i-1));
                letrasChutadas.add(chute);
            }

            if(acertos == letrasDistintas){
                break;
            }
        }

        if(acertos == letrasDistintas){
            System.out.println(String.format("Você venceu a forca! A palavra era %s.", palavra));
        }else{
            System.out.println(String.format("Você perdeu a forca! A palavra era %s.", palavra));
        }
    }

    public static void exercicio5_Anderson(){
        String palavra = "banana";
        String[] palavraSplitada = palavra.split("");
        List<String> palavraSplitadaList = Arrays.asList(palavraSplitada);
        char[] palavraSplitada_char = palavra.toCharArray();
        //in.next().charAt(0);

        //método fill array
        boolean[] arrayTeste = new boolean[10];
        Arrays.fill(arrayTeste, false);

        System.out.println(Arrays.toString(palavraSplitada));

        /* ------------------------- */
        Scanner in = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Jogador 1, escolha a palavra que deverá ser adivinhada!");
        String palavraParaSerAdivinhadaInput = in.next();

        System.out.println("Jogador 1, de uma dica!");
        String dicaDaPalavraParaSerAdivinhada = in.next();

        palavraParaSerAdivinhadaInput = palavraParaSerAdivinhadaInput.trim();

        int maximoDeChutes = 10;
        char[] palavraParaSerAdivinhada = palavraParaSerAdivinhadaInput.toCharArray();

        //método fill list
        List<Boolean> letrasAcertadas = new ArrayList<>(Collections.nCopies(palavraParaSerAdivinhada.length, false));

        System.out.println("Agora é a vez do jogador 2...");
        while(maximoDeChutes > 0 || Arrays.asList(letrasAcertadas).contains(false)) {
            System.out.println("Jogador 2, chute uma letra!");
            char chute = in.next().charAt(0);

            boolean errouOChute = true;
            for (int i = 0; i < palavraParaSerAdivinhada.length; i++) {
                if(chute == palavraParaSerAdivinhada[i]){
                    letrasAcertadas.set(0, true);
                    errouOChute = false;
                }
            }

            if(errouOChute) {
                maximoDeChutes--;
                System.out.println(String.format("Agora você só tem %s chutes", maximoDeChutes));
            }
        }
        System.out.println("");
        in.close();
    }

    public static void main(String[] args) {
        //exercicio1();
        //exercicio2();
        //exercicio3();
        //exercicio4();
        exercicio5();
        //exercicio5_Anderson();
    }
}
