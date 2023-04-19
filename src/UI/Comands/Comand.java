package UI.Comands;

import Services.Service;
import UI.Console;



public  abstract class Comand implements Options{
    private Console console;
    private Service service;
    public Comand(Console console) {
        this.console = console;
    }

    public Console getConsole() {
        return console;
    }
}
