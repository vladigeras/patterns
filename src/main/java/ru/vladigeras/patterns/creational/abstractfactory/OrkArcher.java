package ru.vladigeras.patterns.creational.abstractfactory;

/**
 * @author vladi_geras on 08.11.2019
 */
public class OrkArcher implements Archer {

	@Override
	public void attack() {
		System.out.println("Ork archer :: shoot");
	}
}
