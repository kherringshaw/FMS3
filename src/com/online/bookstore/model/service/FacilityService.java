package com.online.bookstore.model.service;

import com.online.bookstore.dao.FacilityHibernateDAO;
import com.online.bookstore.model.facility.Facility;


public class FacilityService {
	private FacilityHibernateDAO facDAO = new FacilityHibernateDAO();
	
	public void addFacility(Facility fac) {
		try {
			facDAO.addFacility(fac);
	    } catch (Exception se) {
	      System.err.println("FacilityService: Threw a Exception retrieving customer.");
	      System.err.println(se.getMessage());
	    }
	}
}
