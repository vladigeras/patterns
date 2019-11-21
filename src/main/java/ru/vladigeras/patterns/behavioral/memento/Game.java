package ru.vladigeras.patterns.behavioral.memento;

/**
 * @author vladi_geras on 20.11.2019
 */
public class Game {
	private int level = 0;
	private int progress = 0;

	public void set(int level, int progress) {
		this.level = level;
		this.progress = progress;
	}

	public void load(Save save) {
		set(save.getLevel(), save.getProgress());
	}

	public Save save(String name) {
		return new Save(level, progress, name);
	}

	@Override
	public String toString() {
		return "Game{" +
				"level=" + level +
				", progress=" + progress + "%" +
				'}';
	}
}
