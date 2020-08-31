package com.designpattern.behavioural.iterator;

public class NotificationCollection implements Collection {

	static final int MAX_ITEMS = 7;
	int numberOfItems = 0;
	Notification[] notificationList;

	public NotificationCollection() {
		notificationList = new Notification[MAX_ITEMS];
		addItem("Notification 1");
		addItem("Notification 2");

	}

	public void addItem(String str) {
		Notification notification = new Notification(str);
		if (numberOfItems >= MAX_ITEMS) {
			System.err.println("Full");
		} else {
			notificationList[numberOfItems] = notification;
			numberOfItems += 1;
		}
	}

	@Override
	public Iterator createIterator() {
		return new NotificationIterator(notificationList);
	}
}
