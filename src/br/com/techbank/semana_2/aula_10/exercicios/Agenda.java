package br.com.techbank.semana_2.aula_10.exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Agenda {

    private List<Pessoa> contatos = new ArrayList<>();

    public Integer buscaPessoa(String nome){
        Pessoa pessoa = buscaObjetoPessoa(nome);

        if(pessoa != null){
            System.out.printf("\nlog: Pessoa de nome %s encontrada! ", nome);
            return contatos.indexOf(pessoa);
        } else {
            System.out.printf("\nlog: Pessoa de nome %s não encontrada! ", nome);
            return -1;
        }
    }

    private Pessoa buscaObjetoPessoa(String nome){
        Optional<Pessoa> pessoa = contatos.stream().filter(p -> p.getNome().equals(nome)).findFirst();

        return pessoa.orElse(null);
    }

    public void armazenaPessoa(String nome, Integer anoNasc, Float altura){
        Pessoa pessoa = new Pessoa(nome, anoNasc, altura);

        if(contatos.size() > 10){
            System.out.println("log: Sua agenda está cheia!");
        } else {
            this.contatos.add(pessoa);
            System.out.println("log: Pessoa armazenada com sucesso!");
        }
    }

    public void removePessoa(String nome){
        Pessoa pessoa = buscaObjetoPessoa(nome);
        if(pessoa != null){
            contatos.remove(pessoa);
            System.out.printf("\nlog: Pessoa de nome %s removida com sucesso!", nome);
        }
    }

    public void imprimeAgenda(){
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
