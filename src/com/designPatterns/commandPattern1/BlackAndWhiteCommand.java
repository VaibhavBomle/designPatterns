package com.designPatterns.commandPattern1;

import com.designPatterns.commandPattern1.fx.Command;

public class BlackAndWhiteCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Black and white command...");
    }
}
