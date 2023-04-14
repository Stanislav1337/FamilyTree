package UI.Comands;

import UI.Console;

public interface Options {
    String description();
    void execute();
    Console getConsole();
}
