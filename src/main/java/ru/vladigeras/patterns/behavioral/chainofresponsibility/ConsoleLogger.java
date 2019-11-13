package ru.vladigeras.patterns.behavioral.chainofresponsibility;

/**
 * @author vladi_geras on 12.11.2019
 */
public class ConsoleLogger extends AbstractLogger {
	public ConsoleLogger(int level) {
		super(level);
	}

	@Override
	protected void write(String message) {
		System.out.println("Console :: Logger: " + message);
	}
}
