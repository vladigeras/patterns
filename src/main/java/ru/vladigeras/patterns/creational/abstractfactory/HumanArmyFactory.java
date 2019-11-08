package ru.vladigeras.patterns.creational.abstractfactory;

/**
 * @author vladi_geras on 08.11.2019
 */
public class HumanArmyFactory implements ArmyFactory {
	@Override
	public Archer createArcher() {
		return new HumanArcher();
	}

	@Override
	public Mage createMage() {
		return new HumanMage();
	}

	@Override
	public Warrior createWarrior() {
		return new HumanWarrior();
	}
}
