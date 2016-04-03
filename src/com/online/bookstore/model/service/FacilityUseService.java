package com.online.bookstore.model.service;

import com.online.bookstore.dao.FacilityUseHibernateDAO;
import com.online.bookstore.model.facility_use.Facility_use;


public class FacilityUseService {
	private FacilityUseHibernateDAO facUseDAO = new FacilityUseHibernateDAO();
	
	public void addFacilityUse(Facility_use facUse) {
		try {
			facUseDAO.addFacilityUse(facUse);

	    } catch (Exception se) {
	      System.err.println("FacilityService: Threw a Exception adding use.");
	      System.err.println(se.getMessage());
	    }
	}

}
