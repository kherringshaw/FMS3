package com.online.bookstore.model.facility;

public class FacilityImpl implements Facility {
	private int facilityId;
	private String owner;
	private String city;
	@Override
	public int getFacilityId() {
		return facilityId;
	}
	
	@Override
	public void setFacilityId(int facilityId) {
		this.facilityId = facilityId;
		
	}
	
	@Override
	public String getOwner() {
		return owner;
	}
	
	@Override
	public void setOwner(String owner) {
		this.owner = owner;
	}

	@Override
	public void setCity(String city) {
		this.city = city;
		
	}

	@Override
	public String getCity() {
		return city;
	}
	
	

}
