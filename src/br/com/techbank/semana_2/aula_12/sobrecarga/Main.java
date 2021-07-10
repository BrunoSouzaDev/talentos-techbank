package br.com.techbank.semana_2.aula_12.sobrecarga;

public class Main {
    public static void main(String[] args) {
        MinhaLista minhaLista = new MinhaLista();
        minhaLista.add(1);
        minhaLista.add("2");
        minhaLista.add(3.0);
        minhaLista.add(4f);

        System.out.println(minhaLista);
    }
}
