package com.cjc.ims.app.model;

public class Batch {

	private int bid;
	private String bname;
	private Faculty facultyObj;
	
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public Faculty getFacultyObj() {
		return facultyObj;
	}
	public void setFacultyObj(Faculty facultyObj) {
		this.facultyObj = facultyObj;
	}
	@Override
	public String toString() {
		return "Batch [bid=" + bid + ", bname=" + bname + ", facultyObj="
				+ facultyObj + "]";
	}
	
	
	
}
