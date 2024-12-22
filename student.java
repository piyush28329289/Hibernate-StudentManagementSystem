package com.Studentproject.dto;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "student")
public class student {
	@Id
	@Column(name = "Rollno")
	int roll_no;
	@Column(name = "Student_name")
	String Sname;
	@Column(name = "Address")
	String address;
	@Column(name = "contactNo")
	long mob_no;
	@Column(name = "Dob")
	@Temporal(TemporalType.DATE)
	Date dob;

	public student() {

	}

	public student(int roll_no, String sname, String address, long mob_no, Date dob) {
		super();
		this.roll_no = roll_no;
		Sname = sname;
		this.address = address;
		this.mob_no = mob_no;
		this.dob = dob;
	}

	public int getRoll_no() {
		return roll_no;
	}

	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}

	public String getSname() {
		return Sname;
	}

	public void setSname(String sname) {
		Sname = sname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getMob_no() {
		return mob_no;
	}

	public void setMob_no(long mob_no) {
		this.mob_no = mob_no;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date date) {
		this.dob = date;
	}

	@Override
	public String toString() {
		return "student [roll_no=" + roll_no + ", Sname=" + Sname + ", address=" + address + ", mob_no=" + mob_no
				+ ", dob=" + dob + "]";
	}

}
