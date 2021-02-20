package com.designPatterns.statePattern;

/**
 * State Pattern
 * -------------
 * @author Vaibhav
 *
 */
public class StatePatternMain {

	public static void main(String[] args) {
		var canvas =new Canvas();
		canvas.setCurrentTool(new SelectionTool());
		canvas.mouseUp();
		canvas.mouseDown();
		
		System.out.println();
		
		canvas.setCurrentTool(new BrushTool());
		canvas.mouseUp();
		canvas.mouseDown();
		
		System.out.println();
		
		canvas.setCurrentTool(new PaintTool());
		canvas.mouseUp();
		canvas.mouseDown();

	}

}
