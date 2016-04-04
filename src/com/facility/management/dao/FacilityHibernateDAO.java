package com.facility.management.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.facility.management.model.facility.Facility;
import com.online.bookstore.model.customer.Address;
import com.facility.management.dao.HibernatePGSQLHelper;


public class FacilityHibernateDAO {
	public void addFacility(Facility fac) {
		System.out.println("*************** Adding facility in DB with ID ...  " 
				+ fac.getFacilityId());
		Session session = HibernatePGSQLHelper.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.save(fac);
		session.getTransaction().commit();
	}
	public void deleteFacility(Facility fac) {
		System.out.println("*************** Deleteing facility from DB with ID ...  " + fac.getFacilityId());
		Session session = HibernatePGSQLHelper.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.delete(fac);
		session.getTransaction().commit();
		
	}
	
	public List<Facility> queryFacilities(){
		try {
			Connection connection = DBHelper.getConnection();
			Statement statement = connection.createStatement();
			ResultSet rs = statement.executeQuery("SELECT * FROM facility");
			
			List<Facility> list = new ArrayList<>();

			while (rs.next()){
				list.add(new Facility(rs.getInt("facilityId"), rs.getString("owner"), rs.getString("address1"), rs.getString("address2"), rs.getString("city"), rs.getString("state"), rs.getString("zip"), rs.getInt("rate"), rs.getInt("capacity")));
			}

			return list;
		}
			catch(SQLException e) {
				System.err.println("Facility_DAO: Threw a SQLException retrieving the facility object. ");
				System.err.println(e.getMessage());
			}
			return null;
		
	}

    
	@SuppressWarnings("unchecked")
	public int requestAvailableCapacity(int facilityId) {
		try {
		System.out.println("*************** Searcing for capacity for facility with ID ...  " + facilityId);
		Session session = HibernatePGSQLHelper.getSessionFactory().getCurrentSession();
		session.beginTransaction();
        
        Query getCapacityQuery = session.createQuery("From FacilityImpl where facilityId=:facilityId");		
        getCapacityQuery.setString("facilityId", (facilityId + ""));
		
		System.out.println("*************** Retrieve Query is ....>>\n" + getCapacityQuery.toString()); 
		
		List cap = getCapacityQuery.list(); //list of all columns in the facility's row
		System.out.println("Getting Book Details using HQL. \n" + cap.get(0)); //prints only the capacity
		
		System.out.println("*************** Retrieve Query is ....>>\n" + cap.get(0).toString()); 
		
		session.getTransaction().commit();
		return (int)cap.get(0);
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
		
		
		try {
			Connection connection = DBHelper.getConnection();
			Statement statement = connection.createStatement();

			ResultSet rs = statement.executeQuery("SELECT * FROM facility WHERE facilityId = '" + facilityId + "'");
			
			List<Integer> list1 = new ArrayList();

			while (rs.next()){
				list1.add(rs.getInt(9));
			}
			
			//System.out.println("what is in the list: " + list1);

		     Integer sum = new Integer(0); 
		     for (Integer i : list1) {
		         sum = sum + i;
		     }

			return sum;
		}
			catch(SQLException e) {
				System.err.println("Got an exception for calculateUsageRate! ");
				System.err.println(e.getMessage());
			}
			return (Integer) null;
		
	}
	
    public void addFacilityDetail(Facility fac, int facilityId, String details) throws Exception {


            try {
                Connection conn = DBHelper.getConnection();
                PreparedStatement stmt = conn.prepareStatement("UPDATE facility SET details = ? WHERE facilityId = " + facilityId);
                stmt.setString(1, details);


                int result = stmt.executeUpdate();

                if (result == 0) {
                    throw new SQLException("Facility_DAO: Threw a SQLException addingFacilityDetail.");
                }

            } catch (SQLException e) {
                System.out.println("SQLException: " + e);
            }

    }

	public List<Facility> getFacilityDetail(int facilityId) {
		try {
			Connection connection = DBHelper.getConnection();
			Statement statement = connection.createStatement();
			ResultSet rs = statement.executeQuery("SELECT * FROM facility");
			
			List<Facility> list = new ArrayList<>();

			while (rs.next()){
				list.add(new Facility(rs.getInt("facilityId"), rs.getString("details")));
			}

			return list;
		}
			catch(SQLException e) {
				System.err.println("Facility_DAO: Threw a SQLException retrieving the facility object. ");
				System.err.println(e.getMessage());
			}
			return null;
	}


    
    

}
