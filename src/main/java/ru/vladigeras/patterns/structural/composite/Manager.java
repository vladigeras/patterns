package ru.vladigeras.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author vladi_geras on 11.11.2019
 */
public class Manager implements Employee {
	private List<Employee> employees = new ArrayList<>();
	private String name;
	private double salary;

	public Manager(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

	@Override
	public void add(Employee employee) {
		employees.add(employee);
	}

	@Override
	public void remove(Employee employee) {
		employees.remove(employee);
	}

	@Override
	public Employee getChild(int i) {
		return employees.get(i);
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public double getSalary() {
		return salary;
	}

	@Override
	public void print() {
		System.out.println("-------------");
		System.out.println("Name = " + getName());
		System.out.println("Salary = " + getSalary());
		System.out.println("-------------");

		for (Employee employee : employees) {
			employee.print();
		}
	}
}

