package com.online.bookstore.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.online.bookstore.model.customer.AddressImpl;
import com.online.bookstore.model.customer.Address;
import com.online.bookstore.model.customer.Customer;

public class CustomerHibernateDAO {

	public void addCustomer(Customer cust) {
		System.out.println("*************** Adding customer information in DB with ID ...  " + cust.getCustomerId());
		Session session = HibernatePGSQLHelper.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.save(cust);
		session.getTransaction().commit();
	}
	
	public void deleteCustomer(Customer cust) {
		System.out.println("*************** Deleteing customer information in DB with ID ...  " + cust.getCustomerId());
		Session session = HibernatePGSQLHelper.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.delete(cust);
		session.getTransaction().commit();
	}
	
	public Customer retrieveCustomer(String customerId) {
		try {
		System.out.println("*************** Searcing for customer information with ID ...  " + customerId);
		Session session = HibernatePGSQLHelper.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		
		//System.out.println("*************** Hibernate session is created ..................\n" + session.toString());
		
		//Query getCustQuery = session.createQuery("From CustomerImpl ");
		Query getCustQuery = session.createQuery("From CustomerImpl where customerId=:customerId");		
		getCustQuery.setString("customerId", customerId);
		
		System.out.println("*************** Retrieve Query is ....>>\n" + getCustQuery.toString()); 
		
		List customers = getCustQuery.list();
		System.out.println("Getting Book Details using HQL. \n" + customers);

		session.getTransaction().commit();
		return (Customer)customers.get(0);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public Address retrieveCustomerAddress(String customerId) {
		try {
		System.out.println("*************** Searcing for customer address information with ID ...  " + customerId);
		Session session = HibernatePGSQLHelper.getSessionFactory().getCurrentSession();
		session.beginTransaction();
	
        //Address billingAdd = (AddressImpl) session.load(AddressImpl.class, customerId);
        
        Query getAddresstQuery = session.createQuery("From AddressImpl where customerId=:customerId");		
        getAddresstQuery.setString("customerId", customerId);
		
		System.out.println("*************** Retrieve Query is ....>>\n" + getAddresstQuery.toString()); 
		
		List addresses = getAddresstQuery.list();
		System.out.println("Getting Book Details using HQL. \n" + addresses.get(0));
		
		System.out.println("*************** Retrieve Query is ....>>\n" + addresses.get(0).toString()); 
		
		session.getTransaction().commit();
		return (Address)addresses.get(0);
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
