package ru.vladigeras.patterns.structural.decorator;

/**
 * @author vladi_geras on 11.11.2019
 */
public class BulletResistantTransportDecorator extends TransportDecorator {
	private boolean isWithBulletResistant;

	public BulletResistantTransportDecorator(Transport transport) {
		super(transport);
		isWithBulletResistant = true;
	}

	@Override
	public void sound() {
		transport.sound();
	}

	@Override
	public void move() {
		transport.move();
	}

	@Override
	public String description() {
		return transport.description() + " with bullet resistant";
	}
}
