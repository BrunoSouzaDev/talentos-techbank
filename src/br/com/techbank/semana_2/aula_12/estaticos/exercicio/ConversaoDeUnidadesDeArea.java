package br.com.techbank.semana_2.aula_12.estaticos.exercicio;

public class ConversaoDeUnidadesDeArea {

    private static double METRO_PARA_PE_QUADRADO = 10.7639;
    private static double PE_QUADRADO_PARA_CM = 929.03;
    private static double MILHA_PARA_ACRE = 640;
    private static double ACRE_PARA_PE_QUADRADO = 43560;

    public static Double converterMetroQuadradoParaPeQuadrado(Double metro){
        return metro*METRO_PARA_PE_QUADRADO;
    }

    public static Double converterPeQuadradoParaCm(Double feet){
        return feet*PE_QUADRADO_PARA_CM;
    }

    public static Double converterMilhaQuadradaParaAcre(Double milha){
        return milha*MILHA_PARA_ACRE;
    }

    public static Double converterAcreParaPeQuadrado(Double acre){
        return acre*ACRE_PARA_PE_QUADRADO;
    }

}
