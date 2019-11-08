package ru.vladigeras.patterns.creational.abstractfactory;

/**
 * @author vladi_geras on 08.11.2019
 */
public class HumanWarrior implements Warrior {

	@Override
	public void attack() {
		System.out.println("Human warrior :: attack");
	}
}
