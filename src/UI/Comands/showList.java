package UI.Comands;

import UI.Console;

public class showList extends Comand{
    public showList(Console console) {
        super(console);
    }
    @Override
    public String description() {
        return "Вывести список объектов";
    }

    @Override
    public void execute() { getConsole().showList();

    }

}
