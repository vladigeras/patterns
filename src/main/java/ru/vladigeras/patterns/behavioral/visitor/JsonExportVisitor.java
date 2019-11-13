package ru.vladigeras.patterns.behavioral.visitor;

/**
 * @author vladi_geras on 13.11.2019
 */
public class JsonExportVisitor implements Visitor {
	@Override
	public String visitDot(Dot dot) {
		return "{" +
				"\"id:\"" + dot.getId() + "," +
				"\"x:\"" + dot.getX() + "," +
				"\"y:\"" + dot.getY() +
				"}";
	}

	@Override
	public String visitCircle(Circle circle) {
		return "{" +
				"\"id:\"" + circle.getId() + "," +
				"\"x:\"" + circle.getX() + "," +
				"\"y:\"" + circle.getY() + "," +
				"\"y:\"" + circle.getY() + "," +
				"\"radius:\"" + circle.getRadius() +
				"}";
	}

	@Override
	public String visitRectangle(Rectangle rectangle) {
		return "{" +
				"\"id:\"" + rectangle.getId() + "," +
				"\"x:\"" + rectangle.getX() + "," +
				"\"y:\"" + rectangle.getY() + "," +
				"\"y:\"" + rectangle.getY() + "," +
				"\"width:\"" + rectangle.getWidth() + "," +
				"\"height:\"" + rectangle.getHeight() +
				"}";
	}

	@Override
	public String export(Shape shape) {
		return shape.accept(this);
	}
}
