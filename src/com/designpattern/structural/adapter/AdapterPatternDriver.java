package com.designpattern.structural.adapter;

public class AdapterPatternDriver {
	public static void main(String[] args) {
		Movable bugattiVeron = new BugattiVeyron();
		MovableAdaptor bugattiVeyronAdapter = new MovableAdapterImpl(bugattiVeron);
		System.out.println("Bugatti veron speed in kmph " + bugattiVeyronAdapter.getSpeed());

		Movable astonMartin = new AstonMartin();
		MovableAdaptor astonMartinAdaptor = new MovableAdapterImpl(astonMartin);
		System.out.println("Aston Martin Speed in KMPH " + astonMartinAdaptor.getSpeed());
	}

}
