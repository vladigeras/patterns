package ru.vladigeras.patterns.structural.bridge;

import java.util.concurrent.TimeUnit;

/**
 * @author vladi_geras on 12.11.2019
 */
public class PaintWorkShop implements WorkShop {

	@Override
	public void work(Vehicle vehicle) {
		System.out.print("Painting... ");
		long timeToTake = 70 * vehicle.getMinWorkTime();
		try {
			TimeUnit.MILLISECONDS.sleep(timeToTake);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.printf("(Time taken: %d millis), Done.\n", timeToTake);
	}
}
