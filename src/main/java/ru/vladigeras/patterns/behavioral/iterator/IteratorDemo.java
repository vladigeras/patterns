package ru.vladigeras.patterns.behavioral.iterator;

import java.util.List;

/**
 * @author vladi_geras on 12.11.2019
 */
public class IteratorDemo {
	public static void main(String[] args) {
		Repository repository = new VehicleRepository(
				List.of(
						new Car("Car", 250),
						new Truck("Truck", 120),
						new Bike("Bike", 220)
				)
		);

		for (Iterator iterator = repository.getIterator(); iterator.hasNext(); ) {
			Vehicle next = (Vehicle) iterator.next();
			System.out.println(next.getModel() + " : " + next.getSpeed());
		}
	}
}
