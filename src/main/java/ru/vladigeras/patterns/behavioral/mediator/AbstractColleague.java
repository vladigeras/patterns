package ru.vladigeras.patterns.behavioral.mediator;

/**
 * @author vladi_geras on 13.11.2019
 */
public abstract class AbstractColleague {
	private Mediator mediator;

	public AbstractColleague(Mediator m) {
		mediator = m;
	}

	public void send(String message) {
		mediator.send(message, this);
	}

	public abstract void receive(String message);
}
