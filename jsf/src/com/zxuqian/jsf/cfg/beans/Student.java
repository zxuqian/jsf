package com.zxuqian.jsf.cfg.beans;

import java.util.List;


public class Student {
	
	public enum Weeks {
		Sunday,
		Monday,
		Tuesday
	}
	
	private String name;
	private List<String> hobbies;
	private Weeks weeks;
	private String contextParam;
	private Address address;
	
	public Student() {
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getHobbies() {
		return hobbies;
	}
	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}

	public Weeks getWeeks() {
		return this.weeks;
	}
	public void setWeeks(Weeks weeks) {
		this.weeks = weeks;
	}

	public String getContextParam() {
		return contextParam;
	}

	public void setContextParam(String contextParam) {
		this.contextParam = contextParam;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
}
