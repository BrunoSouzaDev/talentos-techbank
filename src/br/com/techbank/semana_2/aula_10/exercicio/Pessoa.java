package br.com.techbank.semana_2.aula_10.exercicio;

import java.security.InvalidParameterException;
import java.time.Year;

public class Pessoa {

    private String nome;
    private Integer anoNascimento;
    private Float altura;

    public Pessoa(String nome, Integer anoNascimento, Float altura) {
        if(nome == null || anoNascimento == null || altura == null){
            throw new InvalidParameterException("Informe dados diferentes de nulo.");
        }
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

    public void imprimePessoa(){
        System.out.println(this);
    }
}
