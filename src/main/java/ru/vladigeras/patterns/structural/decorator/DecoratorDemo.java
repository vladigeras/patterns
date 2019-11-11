package ru.vladigeras.patterns.structural.decorator;

/**
 * @author vladi_geras on 11.11.2019
 */
public class DecoratorDemo {
	public static void main(String[] args) {
		Transport car = new Car();
		System.out.println(car.description());

		Boat boat = new Boat();
		System.out.println(boat.description());

		Transport allInclusiveCar = new BulletResistantTransportDecorator(new ColorTransportDecorator(new Car(), Color.BLACK));
		System.out.println(allInclusiveCar.description());

		Transport coloredBoat = new ColorTransportDecorator(new Boat(), Color.BLUE);
		System.out.println(coloredBoat.description());
	}
}
