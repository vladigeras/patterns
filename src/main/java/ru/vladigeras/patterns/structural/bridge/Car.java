package ru.vladigeras.patterns.structural.bridge;

/**
 * @author vladi_geras on 12.11.2019
 */
public class Car extends Vehicle {

	@Override
	public void manufacture() {
		System.out.println("Manufactoring Car...");
		workshops.forEach(workshop -> workshop.work(this));
		System.out.println("Done");
	}

	@Override
	public int getMinWorkTime() {
		return 14;
	}
}
