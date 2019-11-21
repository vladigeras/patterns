package ru.vladigeras.patterns.behavioral.state;

/**
 * @author vladi_geras on 19.11.2019
 */
public class ShippedState implements PackageState {
	private static ShippedState instance = new ShippedState();

	private ShippedState() {
	}

	public static ShippedState instance() {
		return instance;
	}

	@Override
	public void updateState(DeliveryContext ctx) {
		System.out.println("Package is Shipped");
		ctx.setState(TransitionState.instance());
	}
}
