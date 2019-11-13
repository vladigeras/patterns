package ru.vladigeras.patterns.behavioral.strategy;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author vladi_geras on 13.11.2019
 */
public class StrategyDemo {
	public static void main(String[] args) {
		List<Trip> trips = List.of(
				new Trip("Moscow", "Obninsk", BigDecimal.valueOf(500)),
				new Trip("Obninsk", "Kaluga", BigDecimal.valueOf(320)),
				new Trip("Moscow", "Kaluga", BigDecimal.valueOf(820))
		);

		Discounter discounter = new ElderlyDiscounter();
		showTripsWithDiscounters(trips, discounter);

		discounter = new WeekendDiscounter();
		showTripsWithDiscounters(trips, discounter);

		discounter = new ElderlyDiscounter();
		showTripsWithDiscounters(trips, discounter);
	}

	private static void showTripsWithDiscounters(List<Trip> trips, Discounter discounter) {
		trips.forEach(trip -> System.out.println(trip.getFrom() + " -> " + trip.getTo() + " is " + discounter.applyDiscount(trip.getPrice())));
	}
}
