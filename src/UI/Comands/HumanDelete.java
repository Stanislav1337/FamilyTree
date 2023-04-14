package UI.Comands;

import UI.Console;
import Humans.Human;

public class HumanDelete implements Options {
    public Console console;
    public Human human;

    public HumanDelete(Console console) {
        this.console = console;
    }
    @Override
    public String description() {
        return "Удалить человека";
    }

    @Override
    public void execute() {

        System.out.println("Удаляю...");
    }
    public Console getConsole() {
        return console;
    }
}
