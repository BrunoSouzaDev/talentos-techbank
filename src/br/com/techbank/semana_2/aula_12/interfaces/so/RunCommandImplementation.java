package br.com.techbank.semana_2.aula_12.interfaces.so;

public class RunCommandImplementation implements Linux, Windows{

    @Override
    public void runCommandOnLinux() {
        System.out.println("ls");
    }


    @Override
    public void runCommandOnWindows() {
        System.out.println("dir");
    }
}
