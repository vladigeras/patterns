package ru.vladigeras.patterns.structural.bridge;

/**
 * @author vladi_geras on 12.11.2019
 */
public class BridgeDemo {
	public static void main(String[] args) {
		Vehicle bicycle = new Bicycle();
		bicycle.joinWorkshop(new PaintWorkShop());
		bicycle.joinWorkshop(new AssembleWorkShop());
		bicycle.manufacture();

		Vehicle bike = new Bike();
		bike.joinWorkshop(new ProduceWorkShop());
		bike.joinWorkshop(new AssembleWorkShop());
		bike.joinWorkshop(new TestWorkShop());
		bike.manufacture();

		Vehicle car = new Car();
		car.joinWorkshop(new ProduceWorkShop());
		car.joinWorkshop(new AssembleWorkShop());
		car.joinWorkshop(new PaintWorkShop());
		car.joinWorkshop(new TestWorkShop());
		car.manufacture();
	}
}
