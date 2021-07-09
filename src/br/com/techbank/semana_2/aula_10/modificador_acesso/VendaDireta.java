package br.com.techbank.semana_2.aula_10.modificador_acesso;

public class VendaDireta extends Venda{

    VendaDireta(){
        System.out.println(this.getValorDaVenda());
        this.valorDaVendaParaFilhos = 10;
    }
}
