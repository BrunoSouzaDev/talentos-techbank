package br.com.techbank.semana_2.aula_12.abstratos;

public class PorComissao extends Empregado{
    private double salario;
    private double comissao;
    private int numeroDeVendas;

    public PorComissao(String nome, double salario, double comissao, int numeroDeVendas) {
        super(nome);
        this.salario = salario;
        this.comissao = comissao;
        this.numeroDeVendas = numeroDeVendas;
    }

    @Override
    public double ganha() {
        return this.salario + numeroDeVendas * comissao;
    }
}
