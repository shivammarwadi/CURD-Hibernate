package com.shivam.app;

import com.shivam.dao.EmployeeDAO;
import com.shivam.dao.EmployeeDAOFactory;
import com.shivam.entity.Employee;
import java.util.*;

public class App {
	public static void main(String[] args)

	{
		EmployeeDAOFactory empFactory = new EmployeeDAOFactory();
		
		EmployeeDAO dao = empFactory.getEmployeeDAO();
		Scanner sc = new Scanner(System.in);
	do {
		
		System.out.println("******* Welcome CURD Page ********");
		System.out.println(" 1 - Insert Employee\n 2 - Read Employee \n 3 - Update Employee \n 4 - Delete Employee");
		System.out.println("Enter the choice");
		int c = sc.nextInt();

		switch (c) 
	{
		case 1:
			int i = 0;
			do {
					System.out.println("Enter the id");
					int id = sc.nextInt();
					System.out.println("Enter the Name");
					String nam = sc.next();
					System.out.println("Enter the Salary");
					Double sal = sc.nextDouble();
					Employee emp = new Employee(id, nam, sal);
	
					if (dao.saveEmployee(emp)) {
						System.out.println("DATA INSERTED");
					} else {
						System.out.println("DATA NOT INSERTED");
					}
					System.out.println("Insert more data press 1 otherwise 0");
					i = sc.nextInt();
			} while (i > 0);
			break;
			
		case 2:
			System.out.println("Enter the id");
			int id = sc.nextInt();


			Employee ee=dao.getEmployeeById(id); 
	 		if (ee!=null) {
				System.out.println("DATA Found \n"+ ee);
			} else {
				System.out.println("DATA Not Found");
			}
	 	  break;
	 		
	 	  
		case 3:
			System.out.println("Enter the id");
			int idd = sc.nextInt();
			
			Employee gem=dao.getEmployeeById(idd); 
			System.out.println("Data is \n "+ gem);
			
			System.out.println("Enter the Name");
			String nam = sc.next();
			
			System.out.println("Enter the Salary");
			Double sal = sc.nextDouble();
			
			
			Employee emp = new Employee(idd, nam, sal);
	
			if(dao.updateEmployee(emp))
			{
				System.out.println("Data Updated");
			}
			else
			{
				System.out.println("Not updtaed");
			}

			
			break;
			
		case 4:
			
			System.out.println("Enter the id");
			int did = sc.nextInt();			
			
			if(dao.deleteEmployeeById(did))
			{
				System.out.println("Data Deleted");
			}
			else
			{
				System.out.println("Not Deleted");
			}
			break;
		}

	}while(true);
}
}
