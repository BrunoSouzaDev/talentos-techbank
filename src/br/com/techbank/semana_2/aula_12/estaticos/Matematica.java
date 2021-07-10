package br.com.techbank.semana_2.aula_12.estaticos;

public class Matematica {

    int ah;
    int bh;

    public void someDeAhmaisBh(){
        System.out.println(this.ah+this.bh);
    }

    public static void someDeAhmaisBh(int a, int b){
        System.out.println(a+b);
    }
}
