package ru.vladigeras.patterns.structural.bridge;

import java.util.ArrayList;
import java.util.List;

/**
 * @author vladi_geras on 12.11.2019
 */
public abstract class Vehicle {
	protected List<WorkShop> workshops = new ArrayList<>();

	public boolean joinWorkshop(WorkShop workshop) {
		return workshops.add(workshop);
	}

	public abstract void manufacture();

	public abstract int getMinWorkTime();
}
