package com.online.bookstore.dao;

import org.hibernate.Session;

import com.online.bookstore.model.facility.Facility;

public class FacilityHibernateDAO {
	public void addFacility(Facility fac) {
		System.out.println("*************** Adding customer information in DB with ID ...  " 
				+ fac.getFacilityId());
		Session session = HibernatePGSQLHelper.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.save(fac);
		session.getTransaction().commit();
	}
}
