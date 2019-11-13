package ru.vladigeras.patterns.behavioral.iterator;

/**
 * @author vladi_geras on 13.11.2019
 */
public abstract class Vehicle {
	private String model;
	private int speed;

	public Vehicle(String model, int speed) {
		this.model = model;
		this.speed = speed;
	}

	public String getModel() {
		return model;
	}

	public int getSpeed() {
		return speed;
	}
}
