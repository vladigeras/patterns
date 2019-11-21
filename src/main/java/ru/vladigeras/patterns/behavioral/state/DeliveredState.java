package ru.vladigeras.patterns.behavioral.state;

/**
 * @author vladi_geras on 19.11.2019
 */
public class DeliveredState implements PackageState {
	private static DeliveredState instance = new DeliveredState();

	private DeliveredState() {
	}

	public static DeliveredState instance() {
		return instance;
	}

	@Override
	public void updateState(DeliveryContext ctx) {
		System.out.println("Package is Delivered");
	}
}
