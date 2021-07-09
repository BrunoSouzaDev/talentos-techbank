package br.com.techbank.semana_2.aula_10.exercicios;

import java.time.Year;

public class Pessoa {

    private String nome;
    private Integer anoNascimento;
    private Float altura;

    public Pessoa(){
    }

    public Pessoa(String nome, Integer anoNascimento, Float altura) {
        this.nome = nome;
        this.anoNascimento = anoNascimento;
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", anoNascimento=" + anoNascimento +
                ", altura=" + altura +
                "}";
    }

    public String getNome(){
        return nome;
    }

    public void mostrarIdade(){
        int ano = Year.now().getValue();
        Integer idade = ano - anoNascimento;
        System.out.printf("A idade de %s em %d é %d ano(s).\n", nome, ano, idade);
    }
}
