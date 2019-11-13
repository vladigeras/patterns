package ru.vladigeras.patterns.behavioral.visitor;

/**
 * @author vladi_geras on 13.11.2019
 */
public class Circle implements Shape {
	private int id;
	private int radius;
	private int x;
	private int y;

	public Circle(int id, int x, int y, int radius) {
		this.id = id;
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	@Override
	public void move(int x, int y) {
		// move shape
	}

	@Override
	public void draw() {
		// draw shape
	}

	@Override
	public String accept(Visitor visitor) {
		return visitor.visitCircle(this);
	}

	public int getRadius() {
		return radius;
	}

	public int getId() {
		return id;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
}
