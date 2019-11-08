package ru.vladigeras.patterns.creational.abstractfactory;

/**
 * @author vladi_geras on 08.11.2019
 */
public interface ArmyFactory {
	Archer createArcher();

	Mage createMage();

	Warrior createWarrior();
}
