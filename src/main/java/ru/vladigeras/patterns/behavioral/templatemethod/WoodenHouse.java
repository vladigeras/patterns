package ru.vladigeras.patterns.behavioral.templatemethod;

/**
 * @author vladi_geras on 21.11.2019
 */
public class WoodenHouse extends HouseTemplate {
	@Override
	public void buildWindows() {
		System.out.println("Building Wooden Windows");
	}

	@Override
	public void buildWalls() {
		System.out.println("Building Wooden Walls");
	}

	@Override
	public void buildPillars() {
		System.out.println("Building Wooden Pillars");
	}

	@Override
	public void buildFoundation() {
		System.out.println("Building Wooden Foundation");
	}
}
