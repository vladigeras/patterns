package ru.vladigeras.patterns.creational.abstractfactory;

/**
 * @author vladi_geras on 08.11.2019
 */
public class AbstractFactory {
	public ArmyFactory createArmyFactory(Race race) {
		switch (race) {
			case HUMAN:
				return new HumanArmyFactory();
			case ORK:
				return new OrkArmyFactory();
		}
		return null;
	}
}
