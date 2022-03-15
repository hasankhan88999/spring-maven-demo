package com.capg.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Value("100")
	private int stid;
	@Value("Rama")
	private String stname;
	
	@Autowired
	private Address address;
	
	public int getStid() {
		return stid;
	}
	public void setStid(int stid) {
		this.stid = stid;
	}
	public String getStname() {
		return stname;
	}
	public void setStname(String stname) {
		this.stname = stname;
	}
	
	public void displayStudentInfo() {
		System.out.println(stid+" "+stname);
		System.out.println(address);
	}
}
