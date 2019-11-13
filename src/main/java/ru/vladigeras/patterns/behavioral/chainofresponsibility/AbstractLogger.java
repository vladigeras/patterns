package ru.vladigeras.patterns.behavioral.chainofresponsibility;

/**
 * @author vladi_geras on 12.11.2019
 */
public abstract class AbstractLogger implements Logger {
	public static final int DEBUG = 1;
	public static final int INFO = 2;
	public static final int ERROR = 3;

	private Logger next;
	private int level;

	public AbstractLogger(int level) {
		this.level = level;
	}

	@Override
	public Logger setNext(Logger nextLogger) {
		next = nextLogger;
		return this;
	}

	@Override
	public void log(int level, String message) {
		if (this.level <= level) {
			write(message);
		}
		if (next != null) {
			next.log(level, message);
		}
	}

	protected abstract void write(String message);
}
