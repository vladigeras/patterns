package ru.vladigeras.patterns.behavioral.memento;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @author vladi_geras on 20.11.2019
 */
public class FileSaver {
	private List<FileSave> saves = new ArrayList<>();

	public void add(FileSave save) {
		saves.add(save);
	}

	public List<FileSave> getSaves() {
		return saves;
	}

	public void delete(String id) {
		Optional<FileSave> saveOptional = findById(id);
		saveOptional.ifPresent(fileSave -> saves.remove(fileSave));
	}

	public FileSave get(String id) {
		return findById(id)
				.orElse(null);
	}

	private Optional<FileSave> findById(String id) {
		return saves
				.stream()
				.filter(fileSave -> fileSave.getSave().getId().equals(id))
				.findFirst();
	}
}
