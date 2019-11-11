package ru.vladigeras.patterns.structural.decorator;

/**
 * @author vladi_geras on 11.11.2019
 */
public class Boat implements Transport {

	@Override
	public void sound() {
		System.out.println("Boat :: sound");
	}

	@Override
	public void move() {
		System.out.println("Boat :: move");
	}

	@Override
	public String description() {
		return "This is a simple boat";
	}
}
