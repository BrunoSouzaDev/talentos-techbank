package br.com.techbank.semana_2.aula_12.estaticos;

public class Matematica {

    int ah;
    int bh;
    final static double PI = 3.14;

    public static double getPI() {
        return PI;
    }

    public void somaDeAhMaisBh(){
        System.out.println(this.ah+this.bh);
    }

    public static void somaDeAhMaisBh(int a, int b){
        System.out.println(a+b);
    }
}
