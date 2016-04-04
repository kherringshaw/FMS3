package com.facility.management.dao;

import org.hibernate.Session;

import com.facility.management.model.inspections.Inspections;
import com.facility.management.model.service.InspectionService;

public class InspectionsHibernateDAO {
	public void addInspection(Inspections inspect) {
		System.out.println("*************** Adding inspection information in DB with ID ...  " 
				+ inspect.getInspectId());
		Session session = HibernatePGSQLHelper.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.save(inspect);
		session.getTransaction().commit();
	}
}
