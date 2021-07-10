package br.com.techbank.semana_2.aula_12.abstratos;

public abstract class Empregado {

    private String nome;

    public Empregado(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Empregado{" +
                "nome='" + nome + '\'' +
                '}';
    }

    public abstract double ganha();
}
