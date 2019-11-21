package ru.vladigeras.patterns.behavioral.state;

/**
 * @author vladi_geras on 19.11.2019
 */
public class StateDemo {
	public static void main(String[] args) {
		DeliveryContext context = new DeliveryContext(null, "e7gn438j");
		context.update();
		context.update();
		context.update();
		context.update();
		context.update();

		DeliveryContext context2 = new DeliveryContext(null, "e7gn438j-1");
		context2.update();
		context2.update();
		context2.update();
		context2.update();
		context2.update();
	}
}
