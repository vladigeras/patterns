package ru.vladigeras.patterns.creational.singleton;

/**
 * @author vladi_geras on 08.11.2019
 */
public class SingletonDemo {
	public static void main(String[] args) {
		System.out.println(Singleton.getInstance() == Singleton.getInstance());
	}
}
