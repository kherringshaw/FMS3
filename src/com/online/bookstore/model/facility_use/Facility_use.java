package com.online.bookstore.model.facility_use;

public interface Facility_use {

	public int getUseId();
	public void setUseId(int useId);
	public int getFacilityId();
	public void setFacilityId(int facilityId);
	public	void setTenant(String tenant);
	public String getTenant();

}
