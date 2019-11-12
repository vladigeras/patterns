package ru.vladigeras.patterns.structural.flyweight;

/**
 * @author vladi_geras on 12.11.2019
 */
public class CharacterB extends AbstractCharacter {

	public CharacterB() {
		symbol = CharacterCode.B;
		width = 7;
		height = 16;
	}

	@Override
	public void print() {
		System.out.println("Symbol = " + symbol + ", Width = " + width + ", Height = " + height);
	}
}
