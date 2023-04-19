package UI.Comands;

import UI.Console;
public class SaveList extends Comand {

    public SaveList(Console console) {
        super(console);
    }
    @Override
    public String description() {
        return ("Сохранить список людей");
    }
    @Override
    public void execute() {
        getConsole().saveFile();
    }
}

