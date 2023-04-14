package UI.Comands;

import UI.Console;



public  class Comand implements Options{
    private Console console;

    public Comand(Console console) {
        this.console = console;
    }

    public Console getConsole() {
        return console;
    }

    @Override
    public String description() {
        return null;
    }

    @Override
    public void execute() {

    }
}
