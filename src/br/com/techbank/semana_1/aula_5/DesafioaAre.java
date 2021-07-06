package br.com.techbank.semana_1.aula_5;

import java.util.Scanner;

public class DesafioaAre {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o valor investido: ");
        double valorInvestido = in.nextDouble();

        double clientesVisualizamAnuncioOriginal = 0;
        double clientesClicamACada100Visualizacoes = 0;
        double clientesCompartilhamACada20Cliques = 0;
        double novasVisualizacoesPorCompartilhamento = 0;
        double cliquesPosNovosCompartilhamentos = 0;
        double novosCompartilhamentos = 0;
        double totalVisualizacoes = 0;

        clientesVisualizamAnuncioOriginal = valorInvestido * 30;
        clientesClicamACada100Visualizacoes = clientesVisualizamAnuncioOriginal * 0.12;
        clientesCompartilhamACada20Cliques = clientesClicamACada100Visualizacoes * 15 / 100;
        novasVisualizacoesPorCompartilhamento = (clientesCompartilhamACada20Cliques) * 40;


        for (int i = 0; i < 3; i++) {
            for (int c = 0; c < clientesCompartilhamACada20Cliques; c++) {
                novasVisualizacoesPorCompartilhamento = novasVisualizacoesPorCompartilhamento + 40;
                cliquesPosNovosCompartilhamentos = (novasVisualizacoesPorCompartilhamento * 12) / 100;
                novosCompartilhamentos = (cliquesPosNovosCompartilhamentos * 15) / 100;
            }

        }


        totalVisualizacoes = novasVisualizacoesPorCompartilhamento + clientesVisualizamAnuncioOriginal;

        System.out.println("Investindo" + " R$" + valorInvestido + " seu anúncio terá aproximadamente "
                + totalVisualizacoes + " visualizações");

        System.out.println(clientesVisualizamAnuncioOriginal);

        System.out.println(novasVisualizacoesPorCompartilhamento);

    }
}
