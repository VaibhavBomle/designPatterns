package com.designPatterns.commandPattern1.editor;

public class BoldCommand implements  UndoableCommand {

    private String prevContent;
    private HtmlDocument document;
    private History history;

    public BoldCommand(HtmlDocument document, History history) {
        this.document = document;
        this.history = history;
    }


    public void execute() {
        prevContent=  document.getContent();
        document.makeBold();
        history.push(this);
    }

    public void unExecute() {
        document.setContent(prevContent);
    }

}
