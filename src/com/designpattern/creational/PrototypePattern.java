package com.designpattern.creational;

import java.util.HashMap;
import java.util.Map;

abstract class Color implements Cloneable {
	protected String colorName;

	abstract void addColor();

	public Object clone() {
		Object clone = null;
		try {
			clone = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return clone;

	}
}

class BlueColor extends Color {
	public BlueColor() {
		this.colorName = "Blue";
	}

	@Override
	void addColor() {
		System.out.println("Blue Color Added");

	}

}

class BlackColor extends Color {
	public BlackColor() {
		this.colorName = "Black";
	}

	@Override
	void addColor() {
		System.out.println("Black Color added");
	}
}

class ColorStore {
	private static Map<String, Color> colorMap = new HashMap<String, Color>();
	static {
		colorMap.put("blue", new BlueColor());
		colorMap.put("black", new BlackColor());
	}

	public static Color getColor(String colorName) {
		return (Color) colorMap.get(colorName).clone();
	}
}

public class PrototypePattern {
	public static void main(String[] args) {
		ColorStore.getColor("blue").addColor();
		ColorStore.getColor("black").addColor();
		ColorStore.getColor("blue").addColor();
		ColorStore.getColor("black").addColor();

	}

}
