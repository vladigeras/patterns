package ru.vladigeras.patterns.behavioral.templatemethod;

/**
 * @author vladi_geras on 21.11.2019
 */
public abstract class HouseTemplate {
	public final void buildHouse() {
		buildFoundation();
		buildPillars();
		buildWalls();
		buildWindows();
		System.out.println("House is built");
	}

	public void buildWindows() {
		System.out.println("Building Default Windows");
	}

	public void buildWalls() {
		System.out.println("Building Default Walls");
	}

	public void buildPillars() {
		System.out.println("Building Default Pillars");
	}

	public void buildFoundation() {
		System.out.println("Building Default Foundation");
	}
}
