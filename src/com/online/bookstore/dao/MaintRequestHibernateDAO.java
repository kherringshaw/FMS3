package com.online.bookstore.dao;

import org.hibernate.Session;

import com.online.bookstore.model.maintenance.MaintRequest;

public class MaintRequestHibernateDAO {
	public void addMaintReq(MaintRequest maint) {
		System.out.println("*************** Adding maintenance request information in DB with ID ...  " 
				+ maint.getMaintId());
		Session session = HibernatePGSQLHelper.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.save(maint);
		session.getTransaction().commit();
	}
}
