package com.designpattern.behavioural.iterator;

public class NotificationBar {
	NotificationCollection notifications;

	public NotificationBar(NotificationCollection notifications) {
		this.notifications = notifications;
	}

	public void printNotifications() {
		Iterator iterator = notifications.createIterator();
		System.out.println("---------NOTIFICATIONS BAR----------");
		while (iterator.hasNext()) {
			Notification notification = (Notification) iterator.next();
			System.out.println(notification.getNotification());
		}
	}
}
