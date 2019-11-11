package ru.vladigeras.patterns.structural.proxy;

/**
 * @author vladi_geras on 11.11.2019
 */
public class HeavyObjectImpl implements HeavyObject {

	public HeavyObjectImpl() {
		System.out.println("Heavy object :: Loading initial configuration");
	}

	@Override
	public void work() {
		System.out.println("Heavy object :: Work");
	}
}
