package com.designPatterns.commandPattern1;

import com.designPatterns.commandPattern1.fx.Command;

import java.util.ArrayList;
import java.util.List;

public class CompositeCommand implements Command {

    List<Command> commands = new ArrayList<>();

    public void addCommand(Command command){
        commands.add(command);
    }
    @Override
    public void execute() {
       for (var command:commands)
           command.execute();
    }
}
