package ru.vladigeras.patterns.behavioral.observer;

import java.io.File;

/**
 * @author vladi_geras on 19.11.2019
 */
public interface EventListener {
	void update(Event eventType, File file);
}
