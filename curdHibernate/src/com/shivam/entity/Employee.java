package com.shivam.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
	@Table(name = "EMP2")
	public class Employee {
		@Id
		@Column(name = "eid")
	    private int id;
		@Column(name = "ename")
	    private String name;
		@Column(name = "esalary")
	    private double salary;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int eId, String name, double salary) {
		super();
		this.id = eId;
		this.name = name;
		this.salary = salary;
	}

	public int geteId() {
		return id;
	}

	public void seteId(int eId) {
		this.id = eId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [eId=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}

