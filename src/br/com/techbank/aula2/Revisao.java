package br.com.techbank.aula2;

public class Revisao {
    public static void main(String[] args) {
        int a = 123;
        int b = 126;
        int c = a/b;

        System.out.println(c);

        int d = 2_147_000_930;
        int e = 2_147_000_930;
        long result = d*1L+e*1L;
        System.out.println(result);
    }
}
