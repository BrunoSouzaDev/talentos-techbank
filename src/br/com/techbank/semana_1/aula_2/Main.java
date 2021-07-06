package br.com.techbank.semana_1.aula_2;

public class Main {
    public static void main(String[] args) {
        int idade = 18;
        boolean verdadeiroOuFalso = true;
        char caractere = 'a';
        byte oneByte = 127;
        byte negativeByte = -128;
        short negativeShortInteger = -32768;
        short positiveShortInteger = 32767;
        int positiveInteger = 2_147_000_930;
        long longValue = 2_147_000_930l;
        float floatingPoint = 2.90f;
        double doublePoint = 2.90;

        Boolean verdadeiroOuFalso_class = true;
        verdadeiroOuFalso_class.getClass();

        System.out.println(verdadeiroOuFalso_class.equals(verdadeiroOuFalso));
    }
}
