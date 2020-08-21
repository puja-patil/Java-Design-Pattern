package com.designpattern.structural.facade;

import com.designpattern.structural.facade.menu.Both;
import com.designpattern.structural.facade.menu.NonVegMenu;
import com.designpattern.structural.facade.menu.VegMenu;

public class HotelKeeper {
	public VegMenu getVegMenu() {
		VegRestaurant v = new VegRestaurant();
		VegMenu vegMenu = (VegMenu) v.getMenus();
		return vegMenu;
	}

	public NonVegMenu getNonVegMenu() {
		NonVegRestaurant nv = new NonVegRestaurant();
		NonVegMenu nonVegMenu = (NonVegMenu) nv.getMenus();
		return nonVegMenu;
	}

	public Both getBoth() {
		VegNonBothRestaurant v = new VegNonBothRestaurant();
		Both both = (Both) v.getMenus();
		return both;
	}
}
