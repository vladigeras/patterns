package ru.vladigeras.patterns.creational.prototype;

import java.util.List;

/**
 * @author vladi_geras on 08.11.2019
 */
public class PrototypeDemo {
	public static void main(String[] args) {
		Developer dev = new Developer("Gerasimov", "Vladislav", List.of("Java", "Spring"));
		System.out.println(dev);

		Developer clone = null;
		try {
			clone = (Developer) dev.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		if (clone != null) {
			System.out.println(clone);
		}
	}
}
