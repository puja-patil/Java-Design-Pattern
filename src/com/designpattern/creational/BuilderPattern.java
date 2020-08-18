package com.designpattern.creational;

public class BuilderPattern {
	static class Coffee {
		private String type;
		private String size;
		private boolean sugar;
		private boolean milk;

		public Coffee(Builder builder) {
			this.type = builder.type;
			this.size = builder.size;
			this.sugar = builder.sugar;
			this.milk = builder.milk;
		}

		public static class Builder {
			private String type;
			private String size;
			private boolean sugar;
			private boolean milk;

			public Builder(String type) {
				this.type = type;
			}

			public Builder sugar(boolean sugar) {
				this.sugar = sugar;
				return this;
			}

			public Builder milk(boolean milk) {
				this.milk = milk;
				return this;
			}

			public Builder size(String size) {
				this.size = size;
				return this;
			}

			public Coffee build() {
				return new Coffee(this);
			}

		}

		@Override
		public String toString() {
			return "Coffee [type=" + type + ", size=" + size + ", sugar=" + sugar + ", milk=" + milk + "]";
		}

	}

	public static void main(String[] args) {
		Coffee coffee = new BuilderPattern.Coffee.Builder("Mocha").milk(false).sugar(false).size("Large").build();
		System.out.println(coffee);
	}

}
