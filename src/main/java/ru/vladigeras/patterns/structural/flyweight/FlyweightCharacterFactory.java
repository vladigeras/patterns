package ru.vladigeras.patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author vladi_geras on 12.11.2019
 */
public class FlyweightCharacterFactory {
	private static final Map<CharacterCode, Character> CHARACTERS = new HashMap<>();

	public Character getCharacter(CharacterCode code) {
		Character character = CHARACTERS.get(code);
		if (character == null) {
			switch (code) {
				case A: {
					character = new CharacterA();
					break;
				}
				case B: {
					character = new CharacterB();
					break;
				}
				case C: {
					character = new CharacterC();
					break;
				}
			}
			System.out.println("Character " + code + " was created");
			CHARACTERS.put(code, character);
		}
		return character;
	}
}
