package com.designPatterns.statePattern;

public class SelectionTool implements Tool {

	@Override
	public void mouseDown() {
		System.out.println("Selection Icon");
		
	}

	@Override
	public void mouseUp() {
		System.out.println("Draw Dash Ractangle");
		
	}

}
