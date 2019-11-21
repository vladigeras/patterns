package ru.vladigeras.patterns.behavioral.templatemethod;

/**
 * @author vladi_geras on 21.11.2019
 */
public class StoneHouse extends HouseTemplate {
	@Override
	public void buildWindows() {
		System.out.println("Building Stone Windows");
	}

	@Override
	public void buildWalls() {
		System.out.println("Building Stone Walls");
	}

	@Override
	public void buildPillars() {
		System.out.println("Building Stone Pillars");
	}

	@Override
	public void buildFoundation() {
		System.out.println("Building Stone Foundation");
	}
}
