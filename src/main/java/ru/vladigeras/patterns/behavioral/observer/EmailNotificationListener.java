package ru.vladigeras.patterns.behavioral.observer;

import java.io.File;

/**
 * @author vladi_geras on 19.11.2019
 */
public class EmailNotificationListener implements EventListener {
	private String email;

	public EmailNotificationListener(String email) {
		this.email = email;
	}

	@Override
	public void update(Event eventType, File file) {
		System.out.println("Email to " + email + " :: " + eventType + " :: " + file.getName());
	}
}
