package com.designpattern.structural.facade;

import com.designpattern.structural.facade.menu.Both;
import com.designpattern.structural.facade.menu.Menus;

public class VegNonBothRestaurant implements Hotel {
	@Override
	public Menus getMenus() {
		Both b = new Both();
		return b;
	}
}
