package ru.vladigeras.patterns.structural.flyweight;

/**
 * @author vladi_geras on 12.11.2019
 */
public class CharacterA extends AbstractCharacter {

	public CharacterA() {
		symbol = CharacterCode.A;
		width = 5;
		height = 10;
	}

	@Override
	public void print() {
		System.out.println("Symbol = " + symbol + ", Width = " + width + ", Height = " + height);
	}
}
