package com.designPatterns.statePattern;

public class PaintTool implements Tool {

	@Override
	public void mouseDown() {
		System.out.println("Paint Icon");

	}

	@Override
	public void mouseUp() {
		System.out.println("Draw broad line");

	}

}
