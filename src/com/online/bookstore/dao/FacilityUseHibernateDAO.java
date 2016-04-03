package com.online.bookstore.dao;

import org.hibernate.Session;

import com.online.bookstore.model.facility_use.Facility_use;
import com.online.bookstore.model.service.FacilityUseService;

public class FacilityUseHibernateDAO {
	public void addFacilityUse(Facility_use facUse) {
		System.out.println("*************** Adding facilityUse information in DB with ID ...  " 
				+ facUse.getUseId());
		Session session = HibernatePGSQLHelper.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.save(facUse);
		session.getTransaction().commit();
	}
}
