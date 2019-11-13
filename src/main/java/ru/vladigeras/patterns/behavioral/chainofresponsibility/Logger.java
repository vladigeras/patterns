package ru.vladigeras.patterns.behavioral.chainofresponsibility;

/**
 * @author vladi_geras on 12.11.2019
 */
public interface Logger {
	Logger setNext(Logger logger);

	void log(int level, String message);
}
