package br.com.techbank.semana_2.aula_12.interfaces.so;

public class Main {

    public static void runCommand(Object o){
        if(o instanceof Windows){
            ((Windows) o).runCommandOnWindows();
        }

        if(o instanceof Linux){
            ((Linux) o).runCommandOnLinux();
        }
    }

    public static void runLinuxCommands(Linux linux){
        linux.runCommandOnLinux();
    }

    public static void runWindowsCommands(Windows windows){
        windows.runCommandOnWindows();
    }

    public static void main(String[] args) {
        RunCommandImplementation command = new RunCommandImplementation();
        runLinuxCommands(command);
        runWindowsCommands(command);

        runCommand(command);
    }
}
