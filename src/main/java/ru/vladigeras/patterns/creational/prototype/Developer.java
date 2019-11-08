package ru.vladigeras.patterns.creational.prototype;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author vladi_geras on 08.11.2019
 */
public class Developer implements Cloneable {
	private String lastName;
	private String firstName;
	private List<String> skills = new ArrayList<>();

	public Developer(String lastName, String firstName, List<String> skills) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.skills = skills == null ? Collections.emptyList() : skills;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		List<String> tempSkills = skills == null ? Collections.emptyList() : new ArrayList<>(skills);
		return new Developer(lastName, firstName, tempSkills);
	}

	@Override
	public String toString() {
		return "Developer{" +
				"lastName='" + lastName + '\'' +
				", firstName='" + firstName + '\'' +
				", skills=" + skills +
				'}';
	}
}
