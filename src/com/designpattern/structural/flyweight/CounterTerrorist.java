package com.designpattern.structural.flyweight;

public class CounterTerrorist implements Player {
	private final String TASK;
	private String weapon;

	public CounterTerrorist() {
		TASK = "DIFFUSE BOMB";
	}

	@Override
	public void assignWeapon(String weapon) {
		this.weapon = weapon;
	}

	@Override
	public void mission() {
		System.out.println("The weapon is " + weapon + " | The task is " + TASK);
	}
}
