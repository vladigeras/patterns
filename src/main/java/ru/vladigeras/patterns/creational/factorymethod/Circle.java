package ru.vladigeras.patterns.creational.factorymethod;

/**
 * @author vladi_geras on 08.11.2019
 */
public class Circle implements Shape {

	@Override
	public void draw() {
		System.out.println("Circle shape :: draw");
	}
}
