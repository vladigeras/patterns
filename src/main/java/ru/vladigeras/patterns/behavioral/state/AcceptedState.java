package ru.vladigeras.patterns.behavioral.state;

/**
 * @author vladi_geras on 19.11.2019
 */
public class AcceptedState implements PackageState {
	private static AcceptedState instance = new AcceptedState();

	private AcceptedState() {
	}

	public static AcceptedState instance() {
		return instance;
	}

	@Override
	public void updateState(DeliveryContext ctx) {
		System.out.println("Package is Accepted");
		ctx.setState(ShippedState.instance());
	}
}
