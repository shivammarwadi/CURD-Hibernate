package com.shivam.dao;

import com.shivam.entity.Employee;

public interface EmployeeDAO 
{
	

	boolean saveEmployee(Employee emp);
	boolean updateEmployee(Employee emp);
	Employee getEmployeeById(int id);
	boolean deleteEmployeeById(int id);


}
