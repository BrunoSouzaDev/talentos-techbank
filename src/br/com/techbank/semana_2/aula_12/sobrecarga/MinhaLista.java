package br.com.techbank.semana_2.aula_12.sobrecarga;

import java.util.ArrayList;
import java.util.List;

public class MinhaLista {
    private List<Integer> meusNumeros = new ArrayList<>();

    public void add(Integer i) {
        this.meusNumeros.add(i);
    }

    public void add(String str) {
        this.meusNumeros.add(Integer.valueOf(str));
    }

    public void add(Double d) {
        this.meusNumeros.add(d.intValue());
    }

    public void add(Float f) {
        this.meusNumeros.add(f.intValue());
    }

    @Override
    public String toString() {
        return "MinhaLista{" +
                "meusNumeros=" + meusNumeros +
                '}';
    }
}
