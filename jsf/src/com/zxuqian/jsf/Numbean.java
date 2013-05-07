package com.zxuqian.jsf;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class Numbean {
	
	private int number;
	private int number2;
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getNumber2() {
		return number2;
	}
	public void setNumber2(int number2) {
		this.number2 = number2;
	}
	
	public String add() {
		
		int added = number + number2;
		System.out.println("加上后的数字是： " + added);
		
		return "number"; 
	}
	

}
