package br.com.techbank.semana_2.aula_12._exercicios.exercicio_6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        double minutoParaSegundo = ConversaoUnidadesDeTempo.getMinutoParaSegundo(1);
        double horaParaMinuto = ConversaoUnidadesDeTempo.getHoraParaMinuto(1);
        double anoParaDia = ConversaoUnidadesDeTempo.getAnoParaDia(1);
        double mesParaDias = ConversaoUnidadesDeTempo.getMesParaDias(1);
        double diaParaHora = ConversaoUnidadesDeTempo.getDiaParaHora(1);
        double semanaParaDia = ConversaoUnidadesDeTempo.getSemanaParaDia(1);

        List<Double> resultados = new ArrayList<>(Arrays.asList(minutoParaSegundo,
                horaParaMinuto, anoParaDia, mesParaDias, diaParaHora, semanaParaDia));

        for(Double resultado : resultados){
            System.out.println(resultado);
        }
    }


}
