package com.shivam.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.shivam.entity.Employee;
import com.shivam.utility.HibernateUtility;

public class EmployeeDAOImpl implements EmployeeDAO{

	@Override
	public boolean saveEmployee(Employee emp) {
		SessionFactory factory=HibernateUtility.getSessionFactory();
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		
		session.save(emp);
		
		tx.commit();
		session.close();

		return true;
	}

	@Override
	public boolean updateEmployee(Employee emp) {
		SessionFactory factory=HibernateUtility.getSessionFactory();
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		
		session.update(emp);
		
		tx.commit();
		session.close();

		return true;

	}

	@Override
	public Employee getEmployeeById(int id) {
		SessionFactory factory=HibernateUtility.getSessionFactory();
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		
		Employee emp=(Employee)session.get(Employee.class, id);
		 if(emp!=null)
			 return emp;
		
		session.close();

               	return null;

	}

	@Override
	public boolean deleteEmployeeById(int id) {
		SessionFactory factory=HibernateUtility.getSessionFactory();
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		Employee emp=new Employee();   
		emp.seteId(id);
		session.delete(emp);		
		tx.commit();
		session.close();

		return true;

	}

}
