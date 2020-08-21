package com.designpattern.structural.adapter;

public class MovableAdapterImpl implements MovableAdaptor {
	private Movable luxuryCars;

	public MovableAdapterImpl(Movable cars) {
		this.luxuryCars = cars;
	}

	@Override
	public double getSpeed() {
		return convertMPHToKMPH(luxuryCars.getSpeed());
	}

	private double convertMPHToKMPH(double mph) {
		return mph * 1.60934;
	}
}
