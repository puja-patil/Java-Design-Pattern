package com.designpattern.behavioural.iterator;

public class IteratorDriver {
	public static void main(String[] args) {
		NotificationCollection nc = new NotificationCollection();
		NotificationBar notificationBar = new NotificationBar(nc);
		notificationBar.printNotifications();
	}
}
