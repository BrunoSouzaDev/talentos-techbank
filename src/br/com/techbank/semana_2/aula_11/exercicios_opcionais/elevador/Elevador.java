package br.com.techbank.semana_2.aula_11.exercicios_opcionais.elevador;

public class Elevador {
    /*
    Crie uma classe denominada Elevador para armazenar as informações de um elevador dentro de um prédio.
    A classe deve armazenar o andar atual (térreo = 0), total de andares no prédio (desconsiderando o térreo),
    capacidade do elevador e quantas pessoas estão presentes nele. A classe deve também disponibilizar os seguintes métodos:
     */

    private int andarAtual;
    private int totalAndares;
    private int capacidadeAtual;
    private int capacidadeTotal;

    public Elevador(int totalAndares, int capacidadeTotal) {
        this.andarAtual =
        this.totalAndares = totalAndares;
        this.capacidadeTotal = capacidadeTotal;
        this.capacidadeAtual = 0;
    }

    /*
    Inicializa : que deve receber como parâmetros a capacidade do elevador e o total de andares no prédio (os elevadores sempre começam no térreo e vazio);
    Entra : para acrescentar uma pessoa no elevador (só deve acrescentar se ainda houver espaço);
    Sai : para remover uma pessoa do elevador (só deve remover se houver alguém dentro dele);
    Sobe : para subir um andar (não deve subir se já estiver no último andar);
    Desce : para descer um andar (não deve descer se já estiver no térreo);
     */
    public void inicializa(int capacidadeAtual, int andarAtual){
        this.capacidadeAtual = capacidadeAtual <= capacidadeTotal? capacidadeAtual : 0;;
        this.andarAtual = andarAtual <= totalAndares? andarAtual : 0;

        if (capacidadeAtual > capacidadeTotal){
            System.out.println("Capacidade atual precisa ser menor do que a total. Iniciado com 0.");
        }
        if(andarAtual > totalAndares){
            System.out.println("Andar atual precisa ser menor do que o total. Iniciado com 0.");
        }
    };

    public void entra(){
        this.capacidadeAtual = capacidadeAtual < capacidadeTotal? ++capacidadeAtual : capacidadeAtual;

        if(capacidadeAtual < capacidadeTotal){
            System.out.println("Pessoa entrou.");
        } else {
            System.out.println("Elevador está cheio.");
        }
    }

    public void sai(){
        this.capacidadeAtual = capacidadeAtual > 0? --capacidadeAtual : capacidadeAtual;

        if(capacidadeAtual > 0){
            System.out.println("Pessoa saiu.");
        } else {
            System.out.println("Elevador está vazio.");
        }
    }

    public void sobe(){
        this.andarAtual = andarAtual < totalAndares? ++andarAtual : andarAtual;

        if(andarAtual < totalAndares){
            System.out.println("Elevador subiu.");
        } else {
            System.out.println("Elevador está no topo.");
        }
    }

    public void desce(){
        this.andarAtual = andarAtual > 0? --andarAtual : andarAtual;

        if(andarAtual > 0){
            System.out.println("Elevador desceu.");
        } else {
            System.out.println("Elevador está no térreo.");
        }
    }

    public int getAndarAtual() {
        return andarAtual;
    }

    public int getCapacidadeAtual() {
        return capacidadeAtual;
    }
}
