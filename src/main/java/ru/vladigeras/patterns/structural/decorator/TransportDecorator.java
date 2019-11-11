package ru.vladigeras.patterns.structural.decorator;

/**
 * @author vladi_geras on 11.11.2019
 */
public abstract class TransportDecorator implements Transport {
	protected Transport transport;

	public TransportDecorator(Transport transport) {
		super();
		this.transport = transport;
	}
}
