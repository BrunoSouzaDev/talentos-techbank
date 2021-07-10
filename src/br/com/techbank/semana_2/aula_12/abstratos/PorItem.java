package br.com.techbank.semana_2.aula_12.abstratos;

public final class PorItem extends Empregado{
    //classe final é uma classe que não pode ser extendida

    private double producao; // salario por produção
    private int quantidade;

    public PorItem(String nome, double producao, int quantidade) {
        super(nome);
        this.producao = producao;
        this.quantidade = quantidade;
    }

    @Override
    public double ganha() {
        return producao * quantidade;
    }
}
