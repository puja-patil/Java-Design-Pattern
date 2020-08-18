package com.designpattern.creational;

class Singleton {
	private static Singleton singleInstance = null;
	public String s;

	private Singleton() {
		s = "Hello! This is a string part of Singleton class";
	}

	public static Singleton getInstance() {
		if (singleInstance == null) {
			singleInstance = new Singleton();
		}
		return singleInstance;
	}
}

public class SingletonPattern {
	public static void main(String[] args) {
		// Singleton s = new Singleton();
		// Above line gives error as the constructor is made private for not allowing to
		// create objects
		Singleton x = Singleton.getInstance();
		Singleton y = Singleton.getInstance();
		Singleton z = Singleton.getInstance();
		x.s = x.s.toUpperCase();
		System.out.println(("x is from " + x.s));
		System.out.println(("y is from " + y.s));
		System.out.println(("z is from " + z.s));
		z.s = z.s.toLowerCase();

		System.out.println(("x is from " + x.s));
		System.out.println(("y is from " + y.s));
		System.out.println(("z is from " + z.s));

	}
}
