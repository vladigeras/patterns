package ru.vladigeras.patterns.behavioral.chainofresponsibility;

/**
 * @author vladi_geras on 12.11.2019
 */
public class ErrorLogger extends AbstractLogger {
	public ErrorLogger(int level) {
		super(level);
	}

	@Override
	protected void write(String message) {
		System.out.println("Error :: Logger: " + message);
	}
}
