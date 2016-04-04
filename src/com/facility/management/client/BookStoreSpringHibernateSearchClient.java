package com.facility.management.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.facility.management.model.customer.Address;
import com.facility.management.model.customer.Customer;
import com.facility.management.model.service.CustomerService;

public class BookStoreSpringHibernateSearchClient {
	public static void main (String args[]) throws Exception {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/app-context.xml");
        System.out.println("***************** Application Context instantiated! ******************");

        //Spring to inject the right object implementation in CustomerService for customer using Setter Injection
        //Also, bootstrapping the CustomerService instantiation using factory
        CustomerService customerService = (CustomerService) context.getBean("customerService");
	    System.out.println("*************** Creating Customer service object *************************"); 
	    
        System.out.println("*************** SEARCH EXAMPLE *************************");
 
        //Find a customer if already exists; if not, create a new one.
        Customer searchedCustomer = customerService.findCustomerById("XY9999"); 
             
        System.out.println("Searched customer information .......>>");
        System.out.println("\tName: \t\t\t" + searchedCustomer.getFirstName() + " " + searchedCustomer.getLastName() + "\n");
        
        Address billingAdd = searchedCustomer.getBillingAddress();
        //Address billingAdd = customerService.findCustomerAddress(searchedCustomer.getCustomerId());
        System.out.println("\tBilling Address:\t" + billingAdd.getAddressId() + 
        		"\n\t\t\t\t" + billingAdd.getStreet() +
        		"\n\t\t\t\t" + billingAdd.getUnit() + 
        		"\n\t\t\t\t" + billingAdd.getCity() + ", " + 
        		billingAdd.getState() + " " + billingAdd.getZip() +
        		"\n");
	}
}
