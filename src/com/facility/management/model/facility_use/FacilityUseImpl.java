package com.facility.management.model.facility_use;

public class FacilityUseImpl implements Facility_use {
	
	private int useId;
	private int facilityId;
	private String tenant;
	private String owner;

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
	
	@Override
	public String getOwner() {
		return owner;
	}
	
	@Override
	public void setOwner(String tenant) {
		this.owner = owner;
	}


	
	

}
