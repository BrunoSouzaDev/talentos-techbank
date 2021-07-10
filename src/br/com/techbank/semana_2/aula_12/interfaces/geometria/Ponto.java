package br.com.techbank.semana_2.aula_12.interfaces.geometria;

public class Ponto implements FormaGeometrica {

    private double cordX;

    private double cordY;

    public Ponto(double cordX, double cordY) {
        this.cordX = cordX;
        this.cordY = cordY;
    }


    @Override
    public String forma() {
        return "Ponto: (" + cordX + ", " + cordY + ")";
    }

    @Override
    public void mostrar() {
        System.out.println(forma());
    }
}

