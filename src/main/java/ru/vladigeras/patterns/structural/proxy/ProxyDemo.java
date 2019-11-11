package ru.vladigeras.patterns.structural.proxy;

/**
 * @author vladi_geras on 11.11.2019
 */
public class ProxyDemo {
	public static void main(String[] args) {
		HeavyObject proxy = new HeavyObjectProxy();
		proxy.work();
		proxy.work();
	}
}
