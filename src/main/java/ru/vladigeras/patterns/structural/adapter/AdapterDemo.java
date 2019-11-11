package ru.vladigeras.patterns.structural.adapter;

/**
 * @author vladi_geras on 11.11.2019
 */
public class AdapterDemo {
	public static void main(String[] args) {
		USB adapter = new CardReader(new CustomMemoryCard());
		adapter.connect();
	}
}
