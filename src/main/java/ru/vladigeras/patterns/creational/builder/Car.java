package ru.vladigeras.patterns.creational.builder;

/**
 * @author vladi_geras on 08.11.2019
 */
public class Car {
	private CarClass comfortClass;
	private String mark;
	private String model;
	private String engine;

	private Car(Builder builder) {
		comfortClass = builder.comfortClass;
		mark = builder.mark;
		model = builder.model;
		engine = builder.engine;
	}

	@Override
	public String toString() {
		return "Car{" +
				"comfortClass=" + comfortClass +
				", mark='" + mark + '\'' +
				", model='" + model + '\'' +
				", engine='" + engine + '\'' +
				'}';
	}

	public static class Builder {
		private final CarClass comfortClass;
		private String mark;
		private String model;
		private String engine;

		public Builder(CarClass carClass) {
			comfortClass = carClass;
		}

		public Builder setMark(String mark) {
			this.mark = mark;
			return this;
		}

		public Builder setModel(String model) {
			this.model = model;
			return this;
		}

		public Builder setEngine(String engine) {
			this.engine = engine;
			return this;
		}

		public Car build() {
			return new Car(this);
		}
	}
}
