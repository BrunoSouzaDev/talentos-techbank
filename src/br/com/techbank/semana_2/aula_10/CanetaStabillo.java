package br.com.techbank.semana_2.aula_10;

import java.time.LocalDate;

public class CanetaStabillo extends Caneta{

    String tampaTraseira;
    LocalDate anoPatente;

    CanetaStabillo(){
        this.tubo = "Transparente";
        this.quantidadeDeTinta = 1;
        qtCaneta++;
    }



    public String toString(){
        return "CanetaBic{"+
                "tampaTraseira="+ tampaTraseira + '\'' +
                '}'+'\n'+ super.toString();
        }

    public void metodoFilho() {
        System.out.println("método proprio");
    }

    }
