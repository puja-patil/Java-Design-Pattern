package com.designpattern.creational;

public class FactoryPattern {
	public static class PersonFactory {
		public static Person getPerson(String name, String gender) {
			if (gender.equalsIgnoreCase("F")) {
				return new Female(name);
			} else if (gender.equalsIgnoreCase("M")) {
				return new Male(name);
			}
//			else {}
//			so on
			return null;
		}
	}

	static abstract class Person {
		private String name;

		Person(String name) {
			this.name = name;
		}

		abstract String getSalutation();

		String getNameAndSalutation() {
			return getSalutation() + "." + name;
		}
	}

	static class Female extends Person {
		public Female(String name) {
			super(name);
		}

		@Override
		String getSalutation() {
			return "Miss/Mrs";
		}
	}

	static class Male extends Person {
		public Male(String name) {
			super(name);
		}

		@Override
		String getSalutation() {
			return "Mr";
		}

	}

	public static void main(String[] args) {
		Person female = PersonFactory.getPerson("Pooja", "F");
		System.out.println(female.getNameAndSalutation());
		Person male = PersonFactory.getPerson("Ashutosh", "M");
		System.out.println(male.getNameAndSalutation());
	}

}
