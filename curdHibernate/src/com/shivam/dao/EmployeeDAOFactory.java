package com.shivam.dao;

public class EmployeeDAOFactory 
{
	public EmployeeDAO getEmployeeDAO() {
		return new EmployeeDAOImpl();
	}
	

}
