package ru.vladigeras.patterns.creational.factorymethod;

/**
 * @author vladi_geras on 08.11.2019
 */
public class Rectangle implements Shape {

	@Override
	public void draw() {
		System.out.println("Rectangle shape :: draw");
	}
}
