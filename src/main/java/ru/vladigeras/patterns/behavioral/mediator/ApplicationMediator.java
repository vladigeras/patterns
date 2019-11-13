package ru.vladigeras.patterns.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author vladi_geras on 13.11.2019
 */
public class ApplicationMediator implements Mediator {
	private List<AbstractColleague> colleagues = new ArrayList<>();

	public void addColleague(AbstractColleague colleague) {
		colleagues.add(colleague);
	}

	@Override
	public void send(String message, AbstractColleague from) {
		for (AbstractColleague colleague : colleagues) {
			if (colleague != from) {
				colleague.receive(message);
			}
		}
	}
}
