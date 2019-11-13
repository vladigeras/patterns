package ru.vladigeras.patterns.behavioral.visitor;

/**
 * @author vladi_geras on 13.11.2019
 */
public interface Visitor {
	String visitDot(Dot dot);

	String visitCircle(Circle circle);

	String visitRectangle(Rectangle rectangle);

	String export(Shape shape);
}
