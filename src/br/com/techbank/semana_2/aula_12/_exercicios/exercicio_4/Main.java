package br.com.techbank.semana_2.aula_12._exercicios.exercicio_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Double metroParaPeQuadrado = ConversaoDeUnidadesDeArea.converterMetroQuadradoParaPeQuadrado(1d);
        Double acreParaPeQuadrado = ConversaoDeUnidadesDeArea.converterAcreParaPeQuadrado(1d);
        Double milhaParaAcre = ConversaoDeUnidadesDeArea.converterMilhaQuadradaParaAcre(1d);
        Double peQuadradoParaCm = ConversaoDeUnidadesDeArea.converterPeQuadradoParaCm(1d);

        List<Double> resultados = new ArrayList<>(Arrays.asList(metroParaPeQuadrado,
                acreParaPeQuadrado, milhaParaAcre, peQuadradoParaCm));

        for(Double resultado : resultados){
            System.out.println(resultado);
        }
    }
}
