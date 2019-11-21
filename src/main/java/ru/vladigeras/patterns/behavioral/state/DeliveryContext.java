package ru.vladigeras.patterns.behavioral.state;

/**
 * @author vladi_geras on 19.11.2019
 */
public class DeliveryContext {
	private PackageState state;
	private String packageId;

	public DeliveryContext(PackageState state, String packageId) {
		this.state = state;
		this.packageId = packageId;

		if (state == null) {
			this.state = AcceptedState.instance();
		}
	}

	public PackageState getState() {
		return state;
	}

	public void setState(PackageState state) {
		this.state = state;
	}

	public String getPackageId() {
		return packageId;
	}

	public void update() {
		state.updateState(this);
	}
}
