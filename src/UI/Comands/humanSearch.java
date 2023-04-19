package UI.Comands;

import UI.Console;
public class humanSearch extends Comand{
    public humanSearch(Console console) {
        super(console);
    }

    @Override
    public String description() {
        return "Поиск по фамилии";
    }

    @Override
    public void execute() {getConsole().searchHuman();
    }
}
