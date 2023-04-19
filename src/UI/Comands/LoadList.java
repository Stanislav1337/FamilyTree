package UI.Comands;

import UI.Console;
public class LoadList extends Comand{
    public LoadList(Console console) {
        super(console);
    }

    @Override
    public String description() {
        return ("Загрузить список людей из файла BIN");
    }
    @Override
    public void execute() {getConsole().loadFile();

    }
}
