package com.online.bookstore.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.online.bookstore.model.customer.Customer;
import com.online.bookstore.model.facility_use.Facility_use;
import com.online.bookstore.model.service.FacilityUseService;

public class InsertFacilityUse {

	public static void main(String[] args) throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/app-context.xml");
		
		FacilityUseService facilityUseService = (FacilityUseService) context.getBean("facilityUseService");
		
		 Facility_use facilityUse = (Facility_use) context.getBean("facilityUse");
		 facilityUse.setFacilityId(5);
		 facilityUse.setUseId(1);
		 facilityUse.setTenant("Tenant x");

		 facilityUseService.addFacilityUse(facilityUse);

	}

}
