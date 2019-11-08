package ru.vladigeras.patterns.creational.abstractfactory;

/**
 * @author vladi_geras on 08.11.2019
 */
public class OrkWarrior implements Warrior {

	@Override
	public void attack() {
		System.out.println("Ork warrior :: attack");
	}
}
