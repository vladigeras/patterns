package ru.vladigeras.patterns.structural.flyweight;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * @author vladi_geras on 12.11.2019
 */
public class FlyweightDemo {
	public static void main(String[] args) {
		FlyweightCharacterFactory factory = new FlyweightCharacterFactory();

		CharacterCode[] codes = Stream.concat(
				Arrays.stream(CharacterCode.values()),
				Arrays.stream(CharacterCode.values())
		).toArray(CharacterCode[]::new);

		for (CharacterCode code : codes) {
			Character character = factory.getCharacter(code);
			character.print();
		}
	}
}
