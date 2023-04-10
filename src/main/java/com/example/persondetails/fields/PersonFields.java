package com.example.persondetails.fields;

public class PersonFields {
	
	private int sno;
	private String name;
	private String address;
	private String phnno;
	
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhnno() {
		return phnno;
	}
	public void setPhnno(String phnno) {
		this.phnno = phnno;
	}
	
	public PersonFields(int sno, String name, String address, String phnno) {
		super();
		this.sno = sno;
		this.name = name;
		this.address = address;
		this.phnno = phnno;
	}
	
	

}
