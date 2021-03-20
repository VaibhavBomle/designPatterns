package com.designPatterns.commandPattern1.editor;

/**
 * @author  Vaibhav
 * Implement Undoable Command Mechanism
 */
public class Main {
    public static void main(String[] args) {
        var history = new History();
        var document = new HtmlDocument();
        document.setContent("Hello World");

        var boldCommand = new BoldCommand(document,history);
        boldCommand.execute();
        System.out.println(document.getContent());

        boldCommand.Unexecute();
        System.out.println(document.getContent());

    }
}
