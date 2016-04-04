package com.facility.management.model.maintenance;

public interface MaintRequest {

	public int getFacilityId();
	public void setFacilityId(int facilityId);
	public int getMaintId();
	public void setMaintId(int maintId);
	public void setMaintDesc(String maintDescription);
	public String getMaintDesc();
}
