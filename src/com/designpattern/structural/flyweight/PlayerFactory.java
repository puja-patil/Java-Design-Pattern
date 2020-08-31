package com.designpattern.structural.flyweight;

import java.util.HashMap;

public class PlayerFactory {
	private static HashMap<String, Player> hm = new HashMap<String, Player>();

	public static Player getPlayer(String type) {
		Player player = null;
		if (hm.containsKey(type)) {
			System.out.println(type + " already created!");
			player = hm.get(type);
		} else {
			switch (type) {
			case "Terrorist":
				System.out.println("Terrorist created");
				player = new Terrorist();
				break;
			case "CounterTerrorist":
				System.out.println("Counter terrorist created");
				player = new CounterTerrorist();
				break;
			default:
				System.out.println("Unreachable code");
			}
			hm.put(type, player);
		}
		return player;
	}
}
