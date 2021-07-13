package br.com.techbank.semana_3.aula_13.exercicio_banco;

import java.util.Date;

public class Extrato {

    private Date data;
    private double movimentacao;
    private double saldo;

    @Override
    public String toString() {
        return "Extrato{" +
                "data=" + data +
                ", movimentacao=" + movimentacao +
                ", saldo=" + saldo +
                '}';
    }
}
