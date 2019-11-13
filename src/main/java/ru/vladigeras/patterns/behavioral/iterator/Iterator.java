package ru.vladigeras.patterns.behavioral.iterator;

/**
 * @author vladi_geras on 13.11.2019
 */
public interface Iterator<T> {
	boolean hasNext();

	T next();
}
