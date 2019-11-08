package ru.vladigeras.patterns.creational.abstractfactory;

import java.util.ArrayList;
import java.util.List;

/**
 * @author vladi_geras on 08.11.2019
 */
public class AbstractFactoryDemo {
	public static void main(String[] args) {
		AbstractFactory abstractFactory = new AbstractFactory();
		HumanArmyFactory humanArmyFactory = (HumanArmyFactory) abstractFactory.createArmyFactory(Race.HUMAN);

		List<Specialization> heroes = new ArrayList<>();
		if (humanArmyFactory != null) {
			for (int i = 0; i < 5; i++) {
				heroes.add(humanArmyFactory.createArcher());
				heroes.add(humanArmyFactory.createMage());
				heroes.add(humanArmyFactory.createWarrior());
			}
		}

		OrkArmyFactory orkArmyFactory = (OrkArmyFactory) abstractFactory.createArmyFactory(Race.ORK);
		if (orkArmyFactory != null) {
			for (int i = 0; i < 5; i++) {
				heroes.add(orkArmyFactory.createArcher());
				heroes.add(orkArmyFactory.createMage());
				heroes.add(orkArmyFactory.createWarrior());
			}
		}

		for (Specialization hero : heroes) {
			hero.attack();
		}
	}
}
