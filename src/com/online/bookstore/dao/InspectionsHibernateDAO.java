package com.online.bookstore.dao;

import org.hibernate.Session;

import com.online.bookstore.model.inspections.Inspections;
import com.online.bookstore.model.service.InspectionService;

public class InspectionsHibernateDAO {
	public void addInspection(Inspections inspect) {
		System.out.println("*************** Adding inspection information in DB with ID ...  " 
				+ inspect.getInspectionId());
		Session session = HibernatePGSQLHelper.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.save(inspect);
		session.getTransaction().commit();
	}
}
