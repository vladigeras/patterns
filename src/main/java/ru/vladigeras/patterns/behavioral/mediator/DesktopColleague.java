package ru.vladigeras.patterns.behavioral.mediator;

/**
 * @author vladi_geras on 13.11.2019
 */
public class DesktopColleague extends AbstractColleague {

	public DesktopColleague(Mediator m) {
		super(m);
	}

	@Override
	public void receive(String message) {
		System.out.println("Desktop Colleague Received: " + message);
	}
}
