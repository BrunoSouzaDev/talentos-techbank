package br.com.techbank.semana_2.aula_10;

public class Caneta {

    private String cor;
    String tubo;
    private String ponteira;
    private String carga;
    Integer quantidadeDeTinta;
    private Double peso;
    static Integer qtCaneta = 0;


    @Override
    public String toString() {
        return "Caneta{" +
                "cor='" + cor + '\'' +
                ", tubo='" + tubo + '\'' +
                ", ponteira='" + ponteira + '\'' +
                ", carga='" + carga + '\'' +
                ", quantidadeDeTinta=" + quantidadeDeTinta +
                ", peso=" + peso +
                ", qtCaneta=" + qtCaneta +
                '}';
    }

    public void imprimeQtTinta(){
        System.out.printf("Minha quantidade de tinta é: %d", this.quantidadeDeTinta);
    }
}
