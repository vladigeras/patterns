package ru.vladigeras.patterns.creational.factorymethod;

/**
 * @author vladi_geras on 08.11.2019
 */
public class FactoryMethodDemo {
	public static void main(String[] args) {
		ShapeFactory factory = new ShapeFactory();

		Circle circle = (Circle) factory.getShape(ShapeType.CIRCLE);
		if (circle != null) {
			circle.draw();
		}

		Rectangle rectangle = (Rectangle) factory.getShape(ShapeType.RECTANGLE);
		if (rectangle != null) {
			rectangle.draw();
		}

		Square square = (Square) factory.getShape(ShapeType.SQUARE);
		if (square != null) {
			square.draw();
		}
	}
}
