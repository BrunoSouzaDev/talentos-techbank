package br.com.techbank.semana_2.aula_12._exercicios.exercicio_1;

public class Contador {

    private static int atributo;

    Contador(){
        atributo++;
    }

    public static int getAtributo() {
        return atributo;
    }

    public static void incrementarAtributo(){
        atributo++;
    }

    public static void zerarAtributo(){
        atributo = 0;
    }


    public static void main(String[] args) {
        Contador contador = new Contador();
        Contador contador2 = new Contador();
        Contador contador3 = new Contador();

        System.out.println(Contador.getAtributo());

        Contador.zerarAtributo();

        System.out.println(Contador.getAtributo());

        Contador.incrementarAtributo();
        Contador.incrementarAtributo();
        Contador contador4 = new Contador();

        System.out.println(Contador.getAtributo());
    }
}
