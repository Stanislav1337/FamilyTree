package UI.Comands;

import UI.Console;
import Humans.Human;

public class humanDelete implements Options {
    public Console console;
    public Human human;

    public humanDelete(Console console) {
        this.console = console;
    }
    @Override
    public String description() {
        return "Удалить человека";
    }

    @Override
    public void execute() {
        getConsole().humanDelete();
    }
    public Console getConsole() {
        return console;
    }
}
