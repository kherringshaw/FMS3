package com.online.bookstore.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.online.bookstore.model.customer.Customer;
import com.online.bookstore.model.facility.Facility;
import com.online.bookstore.model.service.FacilityService;

public class InsertFacility {

	public static void main(String[] args) throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/app-context.xml");
		
		FacilityService facilityService = (FacilityService) context.getBean("facilityService");
		
		 Facility facility = (Facility) context.getBean("facility");
		 facility.setFacilityId(5);
		 facility.setOwner("CRAZY");
		 facility.setCity("Chicago");
		 
		 facilityService.addFacility(facility);
	}

}
