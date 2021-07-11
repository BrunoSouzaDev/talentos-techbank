package br.com.techbank.semana_2.aula_12._exercicios.exercicio_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Double metroCubicoParaPeCubico = ConversaoDeUnidadesDeVolume.metroCubicoParaPeCubico(2d);
        Double litroParaCmCubico = ConversaoDeUnidadesDeVolume.litroParaCmCubico(3d);
        Double metroCubicoParaLitro = ConversaoDeUnidadesDeVolume.metroCubicoParaLitro(4d);
        Double galaoAmericanoParaPolegadasCubicas = ConversaoDeUnidadesDeVolume.galaoAmericanoParaPolegadasCubicas(5d);
        Double galaoAmericanoParaLitros = ConversaoDeUnidadesDeVolume.galaoAmericanoParaLitros(1d);

        List<Double> resultados = new ArrayList<>(Arrays.asList(galaoAmericanoParaLitros, galaoAmericanoParaPolegadasCubicas,
                metroCubicoParaLitro, litroParaCmCubico, metroCubicoParaPeCubico));

        for(Double resultado : resultados){
            System.out.println(resultado);
        }
    }
}
