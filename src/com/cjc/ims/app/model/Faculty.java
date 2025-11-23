package com.cjc.ims.app.model;

public class Faculty {
	
	private int fid;
	private String fname;
	private Course courseObj;
	
	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public Course getCourseObj() {
		return courseObj;
	}
	public void setCourseObj(Course courseObj) {
		this.courseObj = courseObj;
	}
	@Override
	public String toString() {
		return "Faculty [fid=" + fid + ", fname=" + fname + ", courseObj="
				+ courseObj + "]";
	}
	
	

}
