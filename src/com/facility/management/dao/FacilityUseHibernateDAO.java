package com.facility.management.dao;

import org.hibernate.Session;

import com.facility.management.model.facility.Facility;
import com.facility.management.model.facility_use.Facility_use;
import com.facility.management.model.service.FacilityUseService;

public class FacilityUseHibernateDAO {
	public void assignFacilityToUse(Facility_use facUse) {
		System.out.println("*************** Adding facilityUse information in DB with ID ...  " 
				+ facUse.getUseId());
		Session session = HibernatePGSQLHelper.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.save(facUse);
		session.getTransaction().commit();
	}
	
	public void vacateFacility(Facility_use fac) {
		System.out.println("*************** Deleteing facility from DB with ID ...  " + fac.getFacilityId());
		Session session = HibernatePGSQLHelper.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.delete(fac);
		session.getTransaction().commit();
		
	}
}
