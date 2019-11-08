package ru.vladigeras.patterns.creational.singleton;

/**
 * @author vladi_geras on 08.11.2019
 */
public class Singleton {
	private static Singleton instance = null;

	private Singleton() {
	}

	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
}
