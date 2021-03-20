package com.designPatterns.commandPattern1.fx;

public class Button {

    public String label;

    public Command command;

    public Button(Command command) {
        this.command = command;
    }

    public void click() {
        //...
        command.execute();
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
