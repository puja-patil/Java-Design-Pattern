package com.designpattern.structural.facade;

import com.designpattern.structural.facade.menu.Menus;
import com.designpattern.structural.facade.menu.VegMenu;

public class VegRestaurant implements Hotel {
	@Override
	public Menus getMenus() {
		VegMenu v = new VegMenu();
		return v;
	}
}
