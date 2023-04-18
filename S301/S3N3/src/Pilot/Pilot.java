package Pilot;

import Interfaces.Command;

import java.util.ArrayList;
import java.util.List;

// Invoker class
public class Pilot {
    private final List<Command> commands = new ArrayList<>();

    public void addCommand(Command command) {
        commands.add(command);
    }

    public void executeCommands() {
        for (Command command : commands) {
            command.execute();
        }
        commands.clear();
    }
}
