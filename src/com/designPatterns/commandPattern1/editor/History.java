package com.designPatterns.commandPattern1.editor;

import java.util.ArrayDeque;
import java.util.Deque;

public class History {


    private Deque<UndoableCommand> commands = new ArrayDeque<>();

    public void push(UndoableCommand undoableCommand){
        commands.add(undoableCommand);
    }

    public UndoableCommand pop(){
        return commands.pop();
    }
}
