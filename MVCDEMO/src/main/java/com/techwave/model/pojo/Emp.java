package com.techwave.model.pojo;

import java.time.LocalDate;

public class Emp {
	private int empno;
	private String ename;
	private String gender;
	private String dob;
	private double basic;

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public double getBasic() {
		return basic;
	}

	public void setBasic(double basic) {
		this.basic = basic;
	}

	public Emp(int empno, String ename, String gender, String dob, double basic) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.gender = gender;
		this.dob = dob;
		this.basic = basic;
	}

	public Emp() {
	}
}
