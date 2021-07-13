package br.com.techbank.semana_3.aula_13.testeAlura;

class Conta {
    double saldo;

    public void deposita(double valor){
        saldo += valor;
    }
}

public class TesteApostilaAlura {

    public static void main(String[] args) {
        Conta c1 = new Conta();
        c1.deposita(100);

        System.out.println(c1.saldo);

        Conta c2 = c1;  // linha importante!
        c2.deposita(200);

        System.out.println(c1.saldo);
        System.out.println(c2.saldo);
    }
}
