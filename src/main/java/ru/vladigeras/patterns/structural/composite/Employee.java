package ru.vladigeras.patterns.structural.composite;

/**
 * @author vladi_geras on 11.11.2019
 */
public interface Employee {
	void add(Employee employee);

	void remove(Employee employee);

	Employee getChild(int i);

	String getName();

	double getSalary();

	void print();
}
