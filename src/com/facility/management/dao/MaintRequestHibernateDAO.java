package com.facility.management.dao;

import org.hibernate.Session;

import com.facility.management.model.maintenance.MaintRequest;

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
