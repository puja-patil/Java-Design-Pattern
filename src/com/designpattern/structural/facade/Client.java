package com.designpattern.structural.facade;

public class Client {
	public static void main(String[] args) {
		HotelKeeper hotelKeeper = new HotelKeeper();

		hotelKeeper.getVegMenu();
		hotelKeeper.getNonVegMenu();
		hotelKeeper.getBoth();
	}

}
