package ru.vladigeras.patterns.behavioral.templatemethod;

import java.util.List;

/**
 * @author vladi_geras on 19.11.2019
 */
public class TemplateMethodDemo {
	public static void main(String[] args) {
		List<HouseTemplate> houses = List.of(new GlassHouse(), new StoneHouse(), new WoodenHouse());
		houses.forEach(HouseTemplate::buildHouse);
	}
}
