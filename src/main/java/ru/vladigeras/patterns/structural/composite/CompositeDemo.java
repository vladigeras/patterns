package ru.vladigeras.patterns.structural.composite;

/**
 * @author vladi_geras on 11.11.2019
 */
public class CompositeDemo {
	public static void main(String[] args) {
		Employee ceo = new Manager("Ivanov", 100);
		Employee architect = new Developer("Gerasimov", 70);
		Employee manager1 = new Manager("Petrov", 70);
		Employee middleDeveloper = new Developer("Alex", 30);
		Employee juniorDeveloper = new Developer("Michael", 20);

		ceo.add(architect);
		ceo.add(manager1);

		manager1.add(middleDeveloper);
		manager1.add(juniorDeveloper);

		ceo.print();
	}
}
