package br.com.techbank.semana_2.aula_12.estaticos.exercicio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Double MetroParaPeQuadrado = ConversaoDeUnidadesDeArea.converterMetroQuadradoParaPeQuadrado(1d);
        Double AcreParaPeQuadrado = ConversaoDeUnidadesDeArea.converterAcreParaPeQuadrado(1d);
        Double MilhaParaAcre = ConversaoDeUnidadesDeArea.converterMilhaQuadradaParaAcre(1d);
        Double PeQuadradoParaCm = ConversaoDeUnidadesDeArea.converterPeQuadradoParaCm(1d);

        List<Double> resultados = new ArrayList<>(Arrays.asList(MetroParaPeQuadrado,
                AcreParaPeQuadrado, MilhaParaAcre, PeQuadradoParaCm));

        for(Double resultado : resultados){
            System.out.println(resultado);
        }
    }
}
