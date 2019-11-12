package ru.vladigeras.patterns.structural.composite;

/**
 * @author vladi_geras on 11.11.2019
 */
public class Developer implements Employee {
	private String name;
	private double salary;

	public Developer(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

	@Override
	public void add(Employee employee) {
		// no child employee
	}

	@Override
	public void remove(Employee employee) {
		// no child employee
	}

	@Override
	public Employee getChild(int i) {
		// no child employee
		return null;
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
	}
}
