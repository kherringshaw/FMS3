package com.online.bookstore.model.service;

import com.online.bookstore.dao.InspectionsHibernateDAO;
import com.online.bookstore.model.inspections.Inspections;


public class InspectionService {
	private InspectionsHibernateDAO inspectDAO = new InspectionsHibernateDAO();
	
	public void addInspection(Inspections inspect) {
		try {
			inspectDAO.addInspection(inspect);

	    } catch (Exception se) {
	      System.err.println("InspectionService: Threw a Exception adding inspection.");
	      System.err.println(se.getMessage());
	    }
	}

}
