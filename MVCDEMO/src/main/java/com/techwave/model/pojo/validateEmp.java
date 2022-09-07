package com.techwave.model.pojo;

import java.time.LocalDate;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;



public class validateEmp {
	@NotNull(message = "Required")
	private int empno;
	@NotBlank(message = "Required")
	private String ename;
	@NotBlank(message = "Required")
	@Size(min = 4,max = 6,message = "Min is 4 max is 6")
	private String gender;
	@NotNull(message = "Required")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate dob;
	
	@Min(value = 10000,message = "Basic must be min 10000")
	private double basic;
	@Pattern(regexp = "^[A-Z]{5}[0-9]{4}[A-Z]$",message = "No a valid Pancard No")
	private String pancard;
	public validateEmp() {}
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
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public double getBasic() {
		return basic;
	}
	public void setBasic(double basic) {
		this.basic = basic;
	}
	public String getPancard() {
		return pancard;
	}
	public void setPancard(String pancard) {
		this.pancard = pancard;
	}
	public validateEmp(int empno, String ename, String gender, LocalDate dob, double basic, String pancard) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.gender = gender;
		this.dob = dob;
		this.basic = basic;
		this.pancard = pancard;
	}
	@Override
	public String toString() {
		return "validateEmp [empno=" + empno + ", ename=" + ename + ", gender=" + gender + ", dob=" + dob + ", basic="
				+ basic + ", pancard=" + pancard + "]";
	}
	
	
}
