package com.restapi.api.model;

public class JsonResponse {
	int oldValue;
	int newValue;
	public JsonResponse(int oldValue, int newValue) {
		
		this.oldValue = oldValue;
		this.newValue = newValue;
	}
	public int getOldValue() {
		return oldValue;
	}
	public void setOldValue(int oldValue) {
		this.oldValue = oldValue;
	}
	public int getNewValue() {
		return newValue;
	}
	public void setNewValue(int newValue) {
		this.newValue = newValue;
	}
	@Override
	public String toString() {
		return "JsonResponse [oldValue=" + oldValue + ", newValue=" + newValue + "]";
	}
	
	

}
