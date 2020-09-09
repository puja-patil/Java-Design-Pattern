package com.designpattern.behavioural.observer;

import java.util.ArrayList;
import java.util.List;

public class ObserverPattern {
	static class SachinCenturyNotifier {
		List<SachinFan> sachinFans = new ArrayList<SachinFan>();

		void register(SachinFan fan) {
			sachinFans.add(fan);
		}

		void notifyOnCentury() {
			for (SachinFan sachinFan : sachinFans) {
				sachinFan.announce();
			}
		}
	}

	static class SachinFan {
		private String name;

		public SachinFan(String name) {
			this.name = name;
		}

		void announce() {
			System.out.println(name + " notified");
		}
	}
	
	public static void main(String[] args) {
		SachinCenturyNotifier notifier = new SachinCenturyNotifier();
		notifier.register(new SachinFan("Pooja"));
		notifier.register(new SachinFan("Ashutosh"));
		notifier.notifyOnCentury();
	}

}
