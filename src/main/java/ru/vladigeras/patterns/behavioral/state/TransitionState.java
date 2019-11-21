package ru.vladigeras.patterns.behavioral.state;

/**
 * @author vladi_geras on 19.11.2019
 */
public class TransitionState implements PackageState {
	private static TransitionState instance = new TransitionState();

	private TransitionState() {
	}

	public static TransitionState instance() {
		return instance;
	}

	@Override
	public void updateState(DeliveryContext ctx) {
		System.out.println("Package is Transition");
		ctx.setState(DeliveredState.instance());
	}
}
