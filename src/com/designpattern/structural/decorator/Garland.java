package com.designpattern.structural.decorator;

public class Garland extends TreeDecorator {
	public Garland(ChristmasTree tree) {
		super(tree);
	}

	public String decorate() {
		return super.decorate() + decorateWithGarland();
	}

	public String decorateWithGarland() {
		return " with Garland";
	}
}
