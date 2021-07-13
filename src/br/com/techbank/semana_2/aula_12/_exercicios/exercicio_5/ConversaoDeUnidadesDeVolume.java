package br.com.techbank.semana_2.aula_12._exercicios.exercicio_5;

public class ConversaoDeUnidadesDeVolume {

    private final static double LITRO_PARA_CM_CUBICO = 1000;
    private final static double METRO_CUBICO_PARA_LITRO = 1000;
    private final static double METRO_CUBICO_PARA_PE_CUBICO = 35.32;
    private final static double GALAO_AMERICANO_PARA_POLEGADAS_CUBICAS = 231;
    private final static double GALAO_AMERICANO_PARA_LITROS = 3.785;

    public static Double litroParaCmCubico(Double litro){
        return litro*LITRO_PARA_CM_CUBICO;
    }

    public static Double metroCubicoParaLitro(Double metroCubico){
        return metroCubico*METRO_CUBICO_PARA_LITRO;
    }

    public static Double metroCubicoParaPeCubico(Double metro){
        return metro*METRO_CUBICO_PARA_PE_CUBICO;
    }

    public static Double galaoAmericanoParaPolegadasCubicas(Double galao){
        return galao*GALAO_AMERICANO_PARA_POLEGADAS_CUBICAS;
    }

    public static Double galaoAmericanoParaLitros(Double galao){
        return galao*GALAO_AMERICANO_PARA_LITROS;
    }


}
