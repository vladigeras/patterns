package ru.vladigeras.patterns.behavioral.observer;

import java.io.File;

/**
 * @author vladi_geras on 19.11.2019
 */
public class Editor {
	private EventManager events;
	private File file;

	public Editor() {
		events = new EventManager(Event.OPEN, Event.SAVE);
	}

	public void openFile(String filePath) {
		file = new File(filePath);
		events.notify(Event.OPEN, file);
	}

	public void saveFile() throws Exception {
		if (file != null) {
			events.notify(Event.SAVE, file);
		} else {
			throw new Exception("Open a file first");
		}
	}

	public EventManager getEvents() {
		return events;
	}
}
