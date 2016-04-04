package com.facility.management.client;

import org.hibernate.Session;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.facility.management.dao.HibernatePGSQLHelper;
import com.facility.management.model.customer.Address;
import com.facility.management.model.customer.Customer;
import com.facility.management.model.service.CustomerService;

public class BookStoreSpringHibernateInsertClient {
	public static void main (String args[]) throws Exception {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/app-context.xml");
        System.out.println("***************** Application Context instantiated! ******************");
        CustomerService customerService = (CustomerService) context.getBean("customerService");
        
        System.out.println("*************** INSERT EXAMPLE *************************");
        System.out.println("*************** This example involves Instantiating and Saving Customer ***********************");
        
        System.out.println("*************** Instantiating Customer ***********************");
        Customer customer = (Customer) context.getBean("customer");
		customer.setFirstName("Berhane");
        customer.setLastName("Zewdie");
        customer.setCustomerId("XYZ123");
        
        //Spring to inject the right object implementation in Customer object for BillingAddress using Setter Injection
        Address billingAddress = customer.getBillingAddress();
        billingAddress.setCustomerId(customer.getCustomerId());
        billingAddress.setAddressId("ADD123");
        billingAddress.setStreet("1 Loyola St.");
        billingAddress.setUnit("Suite 306");
        billingAddress.setCity("Chicago");
        billingAddress.setState("IL");
        billingAddress.setZip("60610");	
        
        System.out.println("*************** Saving Customer ***********************");
        customerService.addCustomer(customer);
        System.out.println("*************** Cutomer Inserted *************************");
	}
}
