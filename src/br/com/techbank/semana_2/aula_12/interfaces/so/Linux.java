package br.com.techbank.semana_2.aula_12.interfaces.so;

public interface Linux {

    public void runCommandOnLinux();

    default void runCommandOnLinux(int numero){
        System.out.println("método default");
    }
}
