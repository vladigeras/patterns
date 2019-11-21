package ru.vladigeras.patterns.behavioral.memento;

/**
 * @author vladi_geras on 20.11.2019
 */
public class FileSave {
	private Save save;

	public Save getSave() {
		return save;
	}

	public FileSave setSave(Save save) {
		this.save = save;
		return this;
	}
}
