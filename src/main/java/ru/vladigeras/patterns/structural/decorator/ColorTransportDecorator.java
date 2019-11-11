package ru.vladigeras.patterns.structural.decorator;

/**
 * @author vladi_geras on 11.11.2019
 */
public class ColorTransportDecorator extends TransportDecorator {
	protected Color color;

	public ColorTransportDecorator(Transport transport, Color color) {
		super(transport);
		this.color = color;
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
		return transport.description() + " with color = " + color;
	}
}
