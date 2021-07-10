package br.com.techbank.semana_2.aula_12.interfaces.veiculos;

public interface Veiculo {


    default void metodoConcreto() {
        System.out.println("Método Concreto na Interface");
    }

}
