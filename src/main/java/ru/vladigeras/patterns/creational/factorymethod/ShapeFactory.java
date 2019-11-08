package ru.vladigeras.patterns.creational.factorymethod;

/**
 * @author vladi_geras on 08.11.2019
 */
public class ShapeFactory {

	public Shape getShape(ShapeType type) {
		switch (type) {
			case CIRCLE:
				return new Circle();
			case SQUARE:
				return new Square();
			case RECTANGLE:
				return new Rectangle();
		}
		return null;
	}
}
