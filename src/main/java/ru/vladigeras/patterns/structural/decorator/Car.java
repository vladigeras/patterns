package ru.vladigeras.patterns.structural.decorator;

/**
 * @author vladi_geras on 11.11.2019
 */
public class Car implements Transport {

	@Override
	public void sound() {
		System.out.println("Car :: sound");
	}

	@Override
	public void move() {
		System.out.println("Car :: move");
	}

	@Override
	public String description() {
		return "This is a simple car";
	}
}
