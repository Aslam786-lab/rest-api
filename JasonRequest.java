package com.restapi.api.model;

public class JasonRequest {
	
	int nextN;
	int categoryCode;
	public JasonRequest(int nextN, int categoryCode) {
		super();
		this.nextN = nextN;
		this.categoryCode = categoryCode;
	}
	public int getNextN() {
		return nextN;
	}
	public void setNextN(int nextN) {
		this.nextN = nextN;
	}
	public int getCategoryCode() {
		return categoryCode;
	}
	public void setCategoryCode(int categoryCode) {
		this.categoryCode = categoryCode;
	}
	@Override
	public String toString() {
		return "User [nextN=" + nextN + ", categoryCode=" + categoryCode + "]";
	}

	
	
	
	
	

}
