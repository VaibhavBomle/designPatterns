package com.designPatterns.commandPattern1.editor;

public interface UndoableCommand extends  Command{

    void unExecute();
}
