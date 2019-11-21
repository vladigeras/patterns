package ru.vladigeras.patterns.behavioral.memento;

import java.util.UUID;

/**
 * @author vladi_geras on 20.11.2019
 */
public class Save {
	private String id;
	private String name;
	private int level;
	private int progress;

	public Save(int level, int progress, String name) {
		this.level = level;
		this.progress = progress;
		this.name = name;
		id = UUID.randomUUID().toString();
	}

	public String getName() {
		return name;
	}

	public int getLevel() {
		return level;
	}

	public int getProgress() {
		return progress;
	}

	public String getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Save{" +
				"id='" + id + '\'' +
				", name='" + name + '\'' +
				", level=" + level +
				", progress=" + progress +
				'}';
	}
}
