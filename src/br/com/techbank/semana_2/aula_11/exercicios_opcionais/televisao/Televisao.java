package br.com.techbank.semana_2.aula_11.exercicios_opcionais.televisao;

public class Televisao {

    private int volume;
    private int canal;
    private boolean ligado = false;

    Televisao(){
        volume = 0;
        canal = 1;
    }

    public void aumentarVolume(){
        if(volume < 50) {
            volume++;
        }
    }

    public void diminuirVolume(){
        if(volume > 0){
            volume--;
        }
    }

    public void aumentarCanal(){
        if(canal < 50) {
            canal++;
        } else {
            canal = 0;
        }
    }

    public void diminuirCanal(){
        if(canal >= 1) {
            canal--;
        } else {
            canal = 50;
        }
    }

    public void trocarCanal(int canal){
        if(canal > 0 && canal < 50) {
            this.canal = canal;
        } else {
            return;
        }
    }

    public void consultarVolume(){
        System.out.println(String.format("O volume atual é %d.",volume));
    }

    public void consultarCanal(){
        System.out.println(String.format("O canal atual é %d.",canal));;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
}
