package br.com.techbank.semana_2.aula_12._exercicios.exercicio_6;

public class ConversaoUnidadesDeTempo {

    private static double MINUTO_PARA_SEGUNDO = 60;
    private static double HORA_PARA_MINUTO = 60;
    private static double DIA_PARA_HORA = 24;
    private static double SEMANA_PARA_DIA = 7;
    private static double MES_PARA_DIAS = 30;
    private static double ANO_PARA_DIA = 365.25;

    public static double getMinutoParaSegundo(double minutos){
        return minutos*MINUTO_PARA_SEGUNDO;
    }

    public static double getHoraParaMinuto(double horas){
        return horas*HORA_PARA_MINUTO;
    }

    public static double getDiaParaHora(double dias){
        return dias*DIA_PARA_HORA;
    }

    public static double getSemanaParaDia(double semanas){
        return semanas*SEMANA_PARA_DIA;
    }

    public static double getMesParaDias(double meses){
        return meses*MES_PARA_DIAS;
    }

    public static double getAnoParaDia(double anos){
        return anos*ANO_PARA_DIA;
    }
}
