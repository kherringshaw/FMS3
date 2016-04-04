package com.facility.management.model.facility_use;

public interface Facility_use {

	public int getUseId();
	public void setUseId(int useId);
	public int getFacilityId();
	public void setFacilityId(int facilityId);
	public	void setTenant(String tenant);
	public String getTenant();
	public	void setOwner(String owner);
	public String getOwner();
	public double getFacilityRate();
	public void setFacilityRate(double rate);
	public int getFacilityCapacity();
	public void setFacilityCapacity(int capacity);
	public String getDetail();
	

}
