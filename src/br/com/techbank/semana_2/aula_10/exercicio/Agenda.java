package br.com.techbank.semana_2.aula_10.exercicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Agenda {

    private List<Pessoa> contatos;

    Agenda(){
        contatos = new ArrayList<>();
    }

    public Integer buscarPessoa(String nome){
        Pessoa pessoa = buscarObjetoPessoa(nome);

        if(pessoa != null){
            System.out.printf("\nlog: Pessoa de nome %s encontrada! ", nome);
            return contatos.indexOf(pessoa);
        } else {
            System.out.printf("\nlog: Pessoa de nome %s não encontrada! ", nome);
            return -1;
        }
    }

    private Pessoa buscarObjetoPessoa(String nome){
        Optional<Pessoa> pessoa = contatos.stream().filter(p -> p.getNome().equals(nome)).findFirst();

        return pessoa.orElse(null);
    }

    public void armazenarPessoa(String nome, Integer anoNasc, Float altura){
        Pessoa pessoa = new Pessoa(nome, anoNasc, altura);

        if(contatos.size() > 10){
            System.out.println("log: Sua agenda está cheia!");
        } else {
            this.contatos.add(pessoa);
            System.out.println("log: Pessoa armazenada com sucesso!");
        }
    }

    public void removerPessoa(String nome){
        Pessoa pessoa = buscarObjetoPessoa(nome);
        if(pessoa != null){
            contatos.remove(pessoa);
            System.out.printf("\nlog: Pessoa de nome %s removida com sucesso!", nome);
        } else {
            System.out.println("Pessoa não encontrada na agenda!");
        }
    }

    public void imprimirAgenda(){
        System.out.printf("\nSua lista de contatos atual com %d contato(s): \n%s\n", contatos.size(), contatos.toString());
    }

    public void imprimePessoa(int index){
        if(contatos.size()>index){
            System.out.printf("\nO contato armazenado na posição %d é %s.\n", index, contatos.get(index));
        }
    }

    public List<Pessoa> getContatos() {
        return contatos;
    }
}
