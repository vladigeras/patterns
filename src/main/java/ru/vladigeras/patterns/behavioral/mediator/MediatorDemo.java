package ru.vladigeras.patterns.behavioral.mediator;

/**
 * @author vladi_geras on 13.11.2019
 */
public class MediatorDemo {
	public static void main(String[] args) {
		ApplicationMediator mediator = new ApplicationMediator();
		AbstractColleague desktop = new DesktopColleague(mediator);
		AbstractColleague mobile = new MobileColleague(mediator);

		mediator.addColleague(desktop);
		mediator.addColleague(mobile);

		desktop.send("Hello World");
		mobile.send("Hello");
	}
}
