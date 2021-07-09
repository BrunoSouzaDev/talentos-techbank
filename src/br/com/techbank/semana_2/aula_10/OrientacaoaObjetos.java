package br.com.techbank.semana_2.aula_10;

public class OrientacaoaObjetos {

    public static void main(String[] args) {
        Caneta minhaCaneta = new CanetaBic();
        CanetaStabillo canetaStabillo = new CanetaStabillo();

        System.out.println(minhaCaneta.toString());
        minhaCaneta.imprimeQtTinta();

        System.out.println(Caneta.qtCaneta);
    }
}
