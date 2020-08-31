package com.designpattern.structural.flyweight;

import java.util.Random;

public class FlyweightDriver {
	private static String[] playerType = { "Terrorist", "CounterTerrorist" };
	private static String[] weapons = { "AK-47", "Maverick", "Gut Knife", "Desert Eagle" };

	public static String getRandPlayerType() {
		Random random = new Random();
		int randInt = random.nextInt(playerType.length);
		return playerType[randInt];
	}

	public static String getRandWeapon() {
		Random random = new Random();
		int randInt = random.nextInt(weapons.length);
		return weapons[randInt];
	}

	public static void main(String[] args) {
		/* Assuming we have 10 players */
		for (int i = 0; i < 10; i++) {
			Player player = PlayerFactory.getPlayer(getRandPlayerType());
			player.assignWeapon(getRandWeapon());
			player.mission();
		}
	}
}
