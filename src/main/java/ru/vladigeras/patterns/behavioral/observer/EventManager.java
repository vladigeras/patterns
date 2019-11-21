package ru.vladigeras.patterns.behavioral.observer;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author vladi_geras on 19.11.2019
 */
public class EventManager {
	private Map<Event, List<EventListener>> listeners = new HashMap<>();

	public EventManager(Event... operations) {
		for (Event operation : operations) {
			listeners.put(operation, new ArrayList<>());
		}
	}

	public void subscribe(Event eventType, EventListener listener) {
		List<EventListener> users = listeners.get(eventType);
		users.add(listener);
	}

	public void unsubscribe(Event eventType, EventListener listener) {
		List<EventListener> users = listeners.get(eventType);
		users.remove(listener);
	}

	public void notify(Event eventType, File file) {
		List<EventListener> users = listeners.get(eventType);
		for (EventListener listener : users) {
			listener.update(eventType, file);
		}
	}
}
