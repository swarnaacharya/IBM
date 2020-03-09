package com.example.demo.model;

public class Student {

	private int sid;

	private String sname;

	private String semail;

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", semail=" + semail + "]";
	}

	public Student(int sid, String sname, String semail) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.semail = semail;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(Integer id) {
		this.sid = id;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSemail() {
		return semail;
	}

	public void setSemail(String semail) {
		this.semail = semail;
	}

}	