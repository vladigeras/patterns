package ru.vladigeras.patterns.behavioral.mediator;

/**
 * @author vladi_geras on 13.11.2019
 */
public interface Mediator {
	void send(String message, AbstractColleague from);
}
