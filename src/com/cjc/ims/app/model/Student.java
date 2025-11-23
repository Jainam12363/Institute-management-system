package com.cjc.ims.app.model;

public class Student {

	private int sid;
	private String sname;
	private Batch batchObj;
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Batch getBatchObj() {
		return batchObj;
	}
	public void setBatchObj(Batch batchObj) {
		this.batchObj = batchObj;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", batchObj="
				+ batchObj + "]";
	}
	
		
}
