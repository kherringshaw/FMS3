package com.online.bookstore.model.facility_use;

public class FacilityUseImpl implements Facility_use {
	
	private int useId;
	private int facilityId;
	private String tenant;

	@Override
	public int getUseId() {
		return useId;
	}
	
	@Override
	public void setUseId(int useId) {
		this.useId = useId;		
	}
	
	@Override
	public int getFacilityId() {
		return facilityId;
	}
	
	@Override
	public void setFacilityId(int facilityId) {
		this.facilityId = facilityId;		
	}
	
	@Override
	public String getTenant() {
		return tenant;
	}
	
	@Override
	public void setTenant(String tenant) {
		this.tenant = tenant;
	}


	
	

}
