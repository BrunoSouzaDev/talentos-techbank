package br.com.techbank.semana_2.aula_12.abstratos;

public class PorHora extends Empregado{

    private double valor;
    private int horas;

    public PorHora(String nome, double valor, int horas){
        super(nome);
        this.valor = valor;
        this.horas = horas;
    }


    @Override
    public double ganha() {
        return this.horas >= 0 && this.horas <= 300 ? this.horas * this.valor : 0;
    }
}
