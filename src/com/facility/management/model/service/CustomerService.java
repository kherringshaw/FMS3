package com.facility.management.model.service;



import com.facility.management.dao.CustomerHibernateDAO;
import com.facility.management.model.customer.Address;
import com.facility.management.model.customer.Customer;

public class CustomerService {
	//private Customer customer;
	private CustomerHibernateDAO custDAO = new CustomerHibernateDAO();
	
	/**
	public void setCustomer(Customer customer) {
	    this.customer = customer;
	  }
	
	public Customer getCustomer() {
		return customer;
	}
	**/
	
	//SEARCH (RETRIEVE/SELECT) customer by ID from the DB
	public Customer findCustomerById(String customerId) {
			
		try {
			Customer customer = custDAO.retrieveCustomer(customerId);
	    	return customer;
	    } catch (Exception se) {
	      System.err.println("CustomerService: Threw a Exception retrieving customer.");
	      System.err.println(se.getMessage());
	    }
		return null;
	}
	
	//INSERT a new customer in the DB
	public void addCustomer(Customer customer) {
		
		try {
			custDAO.addCustomer(customer);
	    } catch (Exception se) {
	      System.err.println("CustomerService: Threw a Exception retrieving customer.");
	      System.err.println(se.getMessage());
	    }
	}
	
	//DELETE a  customer from DB
	public void deleteCustomer(Customer customer) {
			
			try {
				custDAO.deleteCustomer(customer);
		    } catch (Exception se) {
		      System.err.println("CustomerService: Threw a Exception retrieving customer.");
		      System.err.println(se.getMessage());
		    }
	}
	
	//search customer address by ID from the DB
	public Address findCustomerAddress(String customerId) {
				
			try {
				Address address = custDAO.retrieveCustomerAddress(customerId);
		    	return address;
		    } catch (Exception se) {
		      System.err.println("CustomerService: Threw a Exception retrieving customer.");
		      System.err.println(se.getMessage());
		    }
			return null;
		}
	
}
