package UI.Comands;

import Humans.Human;
import UI.Console;

public class humanAdd implements Options{
    public Console console;
    public Human human;
    public humanAdd(Console console) {
        this.console = console;
    }

    @Override
    public String description() {
        return "Добавить  человека";
    }

    public Console getConsole() {
        return console;
    }

    @Override
    public void execute(){getConsole().HumanAdd();}
}
