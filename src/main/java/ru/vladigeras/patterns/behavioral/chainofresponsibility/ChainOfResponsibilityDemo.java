package ru.vladigeras.patterns.behavioral.chainofresponsibility;

/**
 * @author vladi_geras on 12.11.2019
 */
public class ChainOfResponsibilityDemo {
	public static void main(String[] args) {
		Logger chain = getChain();
		chain.log(AbstractLogger.ERROR, "Error");
		chain.log(AbstractLogger.INFO, "Info");
		chain.log(AbstractLogger.DEBUG, "Debug");
	}

	private static Logger getChain() {
		return new ConsoleLogger(AbstractLogger.DEBUG)
				.setNext(
						new FileLogger(AbstractLogger.INFO)
								.setNext(new ErrorLogger(AbstractLogger.ERROR)
								)
				);
	}
}
