package com.designPatterns.commandPattern1;

import com.designPatterns.commandPattern1.fx.Command;

public class ReSizeCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Re-size.......");
    }
}
