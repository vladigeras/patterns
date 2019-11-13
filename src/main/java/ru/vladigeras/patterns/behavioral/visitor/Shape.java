package ru.vladigeras.patterns.behavioral.visitor;

/**
 * @author vladi_geras on 13.11.2019
 */
public interface Shape {
	void move(int x, int y);

	void draw();

	String accept(Visitor visitor);
}
