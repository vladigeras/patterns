package ru.vladigeras.patterns.creational.abstractfactory;

/**
 * @author vladi_geras on 08.11.2019
 */
public class OrkArmyFactory implements ArmyFactory {
	@Override
	public Archer createArcher() {
		return new OrkArcher();
	}

	@Override
	public Mage createMage() {
		return new OrkMage();
	}

	@Override
	public Warrior createWarrior() {
		return new OrkWarrior();
	}
}
