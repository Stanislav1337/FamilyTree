package UI.Comands;

import UI.Console;
public class Exit implements Options {
    public Console console;

    public Exit(Console console) {
        this.console = console;
    }

    @Override
    public String description() {

        return "Закончить работу";
    }

    @Override
    public void execute() {

        getConsole().finish();
    }
    public Console getConsole() {

        return console;
    }
}
