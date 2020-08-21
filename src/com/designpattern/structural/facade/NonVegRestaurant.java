package com.designpattern.structural.facade;

import com.designpattern.structural.facade.menu.Menus;
import com.designpattern.structural.facade.menu.NonVegMenu;

public class NonVegRestaurant implements Hotel {

	@Override
	public Menus getMenus() {
		NonVegMenu nv = new NonVegMenu();
		return nv;
	}
}
