package com.facility.management.model.maintenance;

public class MaintRequestImpl implements MaintRequest {
	private int facilityId;
	private int maintId;
	private String maintDescription;
	
	
	@Override
	public int getFacilityId() {
		return facilityId;
	}
	
	
	@Override
	public void setFacilityId(int facilityId) {
		this.facilityId = facilityId;		
	}
	


	@Override
	public int getMaintId() {
		return maintId;
	}

	@Override
	public void setMaintId(int maintId) {
		this.maintId = maintId;
		
	}

	@Override
	public void setMaintDesc(String maintDescription) {
		this.maintDescription = maintDescription;
		
	}

	@Override
	public String getMaintDesc() {
		return maintDescription;
	}
	
	

}
