package ru.vladigeras.patterns.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author vladi_geras on 13.11.2019
 */
public class VehicleRepository implements Repository {
	private List<Vehicle> data = new ArrayList<>();

	public VehicleRepository(List<Vehicle> data) {
		if (data == null) {
			this.data = new ArrayList<>();
		} else {
			this.data = data;
		}
	}

	@Override
	public Iterator<Vehicle> getIterator() {
		return new VehicleIterator();
	}

	private class VehicleIterator implements Iterator<Vehicle> {
		private int index = 0;

		@Override
		public boolean hasNext() {
			return index < data.size();
		}

		@Override
		public Vehicle next() {
			if (hasNext()) {
				return data.get(index++);
			}
			return null;
		}
	}
}
