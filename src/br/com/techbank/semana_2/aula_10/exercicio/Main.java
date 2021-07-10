package br.com.techbank.semana_2.aula_10.exercicio;

import java.util.Scanner;

import static br.com.techbank.semana_2.aula_10.exercicio.Validator.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Bem-vinda(o) ao app minha agenda! :)");
        Agenda agenda = new Agenda();

        Scanner in = new Scanner(System.in).useDelimiter("\n");
        textoMenu();
        int opcao = in.nextInt();

        do {
            opcao = menu(opcao, in, agenda);
        } while(opcao != 6);

        in.close();
        System.out.println("Encerrando o programa.");
        System.exit(0);
    }

    public static void textoMenu(){
        System.out.println("\n");
        System.out.println("O que deseja fazer? Selecione uma opção:");
        System.out.println("1) Adicionar contatos\n"+
                "2) Buscar Contato\n"+
                "3) Ver Idade dos Contatos\n"+
                "4) Remover Contato\n"+
                "5) Imprimir lista de Contatos\n" +
                "6) Sair");
    }

    public static int menu(int opcao, Scanner in, Agenda agenda){

        switch(opcao){
            case 1:
                adicionarContatos(in, agenda);
                break;
            case 2:
                buscarContato(in, agenda);
                break;
            case 3:
                mostrarIdades(agenda);
                break;
            case 4:
                removerContato(in, agenda);
                break;
            case 5:
                agenda.imprimirAgenda();
                break;
            default:
                System.out.println("Vocë não digitou uma opçáo válida! Programa encerrado.");
                System.exit(1);
                break;
        }

        textoMenu();
        validaInputInt(in);
        return in.nextInt();
    }

    public static void adicionarContatos(Scanner in, Agenda agenda){
        System.out.println("Quantos contatos deseja adicionar?");
        validaInputInt(in);
        Integer qtContatos;
        do{
            qtContatos = in.nextInt();
        } while(validaMaxContatos(qtContatos, agenda));

        for (int i = 1; i <= qtContatos; i++) {
            System.out.printf("Digite o nome do %do contato: ", i);
            String nome = in.next();

            System.out.printf("Digite o ano de nascimento do %do contato: ", i);
            validaInputInt(in);
            Integer anoNasc = in.nextInt();

            System.out.printf("Digite a altura do %do contato: ", i);
            validaInputFloat(in);
            Float altura = in.nextFloat();

            agenda.armazenarPessoa(nome, anoNasc, altura);
        }
    }

    public static void mostrarIdades(Agenda agenda){
        System.out.println("\nVamos ver as idades dos contatos:");
        if(!agenda.getContatos().isEmpty()) {
            agenda.getContatos().forEach(Pessoa::mostrarIdade);
        } else {
            System.out.println("A lista de contatos está vazia!");
        }
    }

    public static void buscarContato(Scanner in, Agenda agenda){
        System.out.println("\nAgora, vamos buscar um contato. Digite um nome para ser procurado: ");
        String nome = in.next();
        agenda.buscarPessoa(nome);
    }

    public static void removerContato(Scanner in, Agenda agenda){
        System.out.println("\nAgora, vamos remover um contato. Digite o nome do contato a ser removido:");
        String nome = in.next();
        agenda.removerPessoa(nome);
    }
}
