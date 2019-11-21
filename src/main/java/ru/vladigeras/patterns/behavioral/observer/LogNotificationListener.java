package ru.vladigeras.patterns.behavioral.observer;

import java.io.File;

/**
 * @author vladi_geras on 19.11.2019
 */
public class LogNotificationListener implements EventListener {
	private File log;

	public LogNotificationListener(String fileName) {
		log = new File(fileName);
	}

	@Override
	public void update(Event eventType, File file) {
		System.out.println("LOG " + log + " :: " + eventType + " :: " + file.getName());
	}
}
