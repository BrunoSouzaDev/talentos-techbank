package br.com.techbank.semana_2.aula_10.exercicios;

import java.util.Scanner;

import static br.com.techbank.semana_2.aula_10.exercicios.Validator.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Bem-vinda(o) ao app minha agenda! :)\n"+
                "Vamos adicionar alguns contatos à agenda");

        Agenda agenda = new Agenda();

        Scanner in = new Scanner(System.in).useDelimiter("\n");
        for (int i = 1; i <= 2; i++) {
            System.out.printf("Digite o nome do %do contato: ", i);
            String nome = in.next();

            System.out.printf("Digite o ano de nascimento do %do contato: ", i);
            validaInputInt(in);
            Integer anoNasc = in.nextInt();

            System.out.printf("Digite a altura do %do contato: ", i);
            validaInputFloat(in);
            Float altura = in.nextFloat();

            agenda.armazenaPessoa(nome, anoNasc, altura);
        }

        agenda.imprimeAgenda();

        System.out.println("\nVamos ver as idades dos contatos:");
        agenda.getContatos().forEach(Pessoa::mostrarIdade);

        System.out.println("\nAgora, vamos buscar um contato.");
        Integer index = -1;
        String nome = "";
        do{
            System.out.print("\nDigite um nome para ser procurado: ");
            nome = in.next();
            index = agenda.buscaPessoa(nome);
        } while(index == -1);

        agenda.imprimePessoa(index);

        System.out.println("\nAgora, vamos remover o contato.");
        agenda.removePessoa(nome);

        agenda.imprimeAgenda();

        in.close();
    }
}
