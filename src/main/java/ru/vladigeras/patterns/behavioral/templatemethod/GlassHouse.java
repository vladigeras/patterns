package ru.vladigeras.patterns.behavioral.templatemethod;

/**
 * @author vladi_geras on 21.11.2019
 */
public class GlassHouse extends HouseTemplate {
	@Override
	public void buildWindows() {
		System.out.println("Building Glass Windows");
	}

	@Override
	public void buildWalls() {
		System.out.println("Building Glass Walls");
	}

	@Override
	public void buildPillars() {
		System.out.println("Building Glass Pillars");
	}

	@Override
	public void buildFoundation() {
		System.out.println("Building Glass Foundation");
	}
}
