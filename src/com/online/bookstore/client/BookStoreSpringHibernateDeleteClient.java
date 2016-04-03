package com.online.bookstore.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.online.bookstore.model.customer.Address;
import com.online.bookstore.model.customer.Customer;
import com.online.bookstore.model.service.CustomerService;

public class BookStoreSpringHibernateDeleteClient {
	public static void main (String args[]) throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/app-context.xml");
		System.out.println("***************** Application Context instantiated! ******************");

		//Spring to inject the right object implementation in CustomerService for customer using Setter Injection
		//Also, bootstrapping the CustomerService instantiation using factory
		CustomerService customerService = (CustomerService) context.getBean("customerService");
		System.out.println("*************** Creating Customer service object *************************"); 
    
		System.out.println("*************** DELETE EXAMPLE *************************");

		//Find a customer if already exists; if not, create a new one.
		Customer searchedCustomer = customerService.findCustomerById("XYZ123"); 
		
		System.out.println("*************** Cutomer to be deleted *************************");
		System.out.println("\tName: \t\t\t" + searchedCustomer.getFirstName() + " " + searchedCustomer.getLastName() + "\n");
        
        Address billingAdd = searchedCustomer.getBillingAddress();
        //Address billingAdd = customerService.findCustomerAddress(searchedCustomer.getCustomerId());
        System.out.println("\tBilling Address:\t" + billingAdd.getAddressId() + 
        		"\n\t\t\t\t" + billingAdd.getStreet() +
        		"\n\t\t\t\t" + billingAdd.getUnit() + 
        		"\n\t\t\t\t" + billingAdd.getCity() + ", " + 
        		billingAdd.getState() + " " + billingAdd.getZip() +
        		"\n");
        
        System.out.println("*************** Cutomer to be deleted *************************");
		customerService.deleteCustomer(searchedCustomer);
		System.out.println("*************** Cutomer deleted *************************");
	}
}
