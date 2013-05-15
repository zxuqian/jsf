package com.zxuqian.jsf;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class Greeting {
	
	private String greeting = "Hello World!";
	
	public Greeting() {
		
	}

	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}
	
	

}
