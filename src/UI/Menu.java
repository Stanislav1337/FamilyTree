package UI;

import UI.Comands.HumanAdd;
import UI.Comands.HumanDelete;
import UI.Comands.Exit;
import UI.Comands.Options;
import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<Options> commands;
    private Console console;

    public Menu(Console console) {
        this.console = console;
        commands = new ArrayList<>();
        commands.add(new HumanAdd(console));
        commands.add(new HumanDelete(console));
        commands.add(new Exit(console));
    }

    void execute(int num){
        Options option = commands.get(num-1);
        option.execute();
    }

    public String printMenu(){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < commands.size(); i++) {
            stringBuilder.append(i+1);
            stringBuilder.append(": ");
            stringBuilder.append(commands.get(i).description());
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}
