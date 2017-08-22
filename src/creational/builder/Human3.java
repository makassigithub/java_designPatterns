package creational.builder;

public class Human3 {

	// This is the builder pattern, design on top of the constructor bean
	// and the telescoping constructor model

	// the outer instance variable are private and final for the should be
	// immutable
	private final String sex;
	private final int age;
	private final String skinColor;

	public static class Builder {

		// the inner instance variable are just private
		private String sex;
		private int age;
		private String skinColor;

		// A non-arg constructor
		public Builder() {
		}

		// Constructor-like method for different type of the instances
		// according the instance variable.
		public Builder buildWithSex(String sex) {
			this.sex = sex;
			return this;
		}

		public Builder buildWithAge(int age) {
			this.age = age;
			return this;
		}

		public Builder buildWitSkincolor(String color) {
			this.skinColor = color;
			return this;
		}

		// the innerClass has a method that return the outerClass
		// by passing itself has a parameter
		public Human3 buildHuman3() {
			return new Human3(this);
		}

	}

	// Now we connect the inner and the outer class using a private constructor
	// the outer class uses the an instance of the inner class to set is
	// properties
	private Human3(Builder builder) {
		this.age = builder.age;
		this.sex = builder.sex;
		this.skinColor = builder.skinColor;
	}

	public String getSex() {
		return sex;
	}

	public int getAge() {
		return age;
	}

	public String getSkinColor() {
		return skinColor;
	}

}
