package ru.vladigeras.patterns.behavioral.mediator;

/**
 * @author vladi_geras on 13.11.2019
 */
public class MobileColleague extends AbstractColleague {
	public MobileColleague(Mediator m) {
		super(m);
	}

	@Override
	public void receive(String message) {
		System.out.println("Mobile Colleague Received: " + message);
	}
}
