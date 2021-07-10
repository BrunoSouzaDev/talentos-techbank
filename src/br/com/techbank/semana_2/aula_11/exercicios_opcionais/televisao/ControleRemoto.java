package br.com.techbank.semana_2.aula_11.exercicios_opcionais.televisao;

public class ControleRemoto {

    private Televisao televisao;

    ControleRemoto(){
        this.televisao = new Televisao();
    }

    /*O controle de volume permite:
    aumentar ou diminuir a potência do volume de som em uma unidade de cada vez;
    aumentar e diminuir o número do canal em uma unidade
    trocar para um canal indicado;
    consultar o valor do volume de som e o canal selecionado.*/

    public boolean isTvLigada(){
        return televisao.isLigado() ? true : false;
    }

    public void aumentarVolume(){
        if(isTvLigada()) {
            televisao.aumentarVolume();
        }
    }

    public void diminuirVolume(){
        if(isTvLigada()) {
            televisao.diminuirVolume();
        }
    }

    public void aumentarCanal(){
        if(isTvLigada()) {
            televisao.aumentarCanal();
        }
    }

    public void diminuirCanal(){
        if(isTvLigada()) {
            televisao.diminuirCanal();
        }
    }

    public void trocarCanal(int canal){
        if(isTvLigada()) {
            televisao.trocarCanal(canal);
        }
    }

    public void consultarVolume(){
        if(isTvLigada()) {
            televisao.consultarVolume();
        }
    }

    public void consultarCanal(){
        if(isTvLigada()) {
            televisao.consultarCanal();
        }
    }

    public void ligar() {
        televisao.setLigado(true);
    }

    public void desligar() {
        if(isTvLigada()) {
            televisao.setLigado(false);
        }
    }

    public void setTelevisao(Televisao televisao) {
        this.televisao = televisao;
    }

    public Televisao getTelevisao() {
        return televisao;
    }

}
