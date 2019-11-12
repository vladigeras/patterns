package ru.vladigeras.patterns.structural.flyweight;

/**
 * @author vladi_geras on 12.11.2019
 */
public class CharacterC extends AbstractCharacter {

	public CharacterC() {
		symbol = CharacterCode.C;
		width = 3;
		height = 9;
	}

	@Override
	public void print() {
		System.out.println("Symbol = " + symbol + ", Width = " + width + ", Height = " + height);
	}
}
