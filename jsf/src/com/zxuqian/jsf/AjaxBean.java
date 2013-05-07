package com.zxuqian.jsf;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name="ajax")
@RequestScoped
public class AjaxBean {
	
	private String response;
	private String name;

	public String getResponse() {
		System.out.println("in get response");
		return response;
	}

	public void setResponse(String response) {
		System.out.println("set input string resposne: " + response);
		this.response = response;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
