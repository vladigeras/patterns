package ru.vladigeras.patterns.creational.builder;

/**
 * @author vladi_geras on 08.11.2019
 */
public class BuilderDemo {
	public static void main(String[] args) {
		Car car = new Car.Builder(CarClass.C)
				.setEngine("1.6")
				.setMark("Mazda")
				.setModel("3")
				.build();

		System.out.println(car);
	}
}
