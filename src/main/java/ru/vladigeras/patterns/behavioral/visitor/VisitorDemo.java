package ru.vladigeras.patterns.behavioral.visitor;

import java.util.List;

/**
 * @author vladi_geras on 13.11.2019
 */
public class VisitorDemo {
	public static void main(String[] args) {
		Visitor visitor = new JsonExportVisitor();
		List<Shape> shapes = List.of(
				new Dot(1, 10, 20),
				new Circle(1, 4, 3, 10),
				new Rectangle(1, 4, 3, 10, 10)
		);

		shapes.forEach(shape -> {
			System.out.println(visitor.export(shape));
		});
	}
}
