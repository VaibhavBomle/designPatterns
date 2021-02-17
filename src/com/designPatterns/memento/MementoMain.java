package com.designPatterns.memento;

/**
 * Memento Design Pattern
 * @author Vaibhav
 *
 */

public class MementoMain {

	public static void main(String[] args) {
		var editor = new Editor();
		var history = new History();
		
		editor.setContent("Edit Square");
		history.push(editor.createState());
		
		editor.setContent("Edit Triangle ");
		history.push(editor.createState());
		
		editor.setContent("Edit Rectangle");
		history.push(editor.createState());
		editor.restore(history.pop());
		editor.restore(history.pop());
		
		System.out.println(editor.getContent());
		
	}

}
