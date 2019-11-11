package ru.vladigeras.patterns.structural.proxy;

/**
 * @author vladi_geras on 11.11.2019
 */
public class HeavyObjectProxy implements HeavyObject {
	private HeavyObject object;

	@Override
	public void work() {
		if (object == null) {
			object = new HeavyObjectImpl();
		}

		object.work();
	}
}
