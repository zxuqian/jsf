package com.zxuqian.jsf.el;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class SimpleCalcutlatorBean {
	
	private Double number1;
	private Double number2;
	private Double result;
	private final String[] operators; 
	
	public SimpleCalcutlatorBean() {
		operators = new String[]{"+", "-", "*", "/"};
	}
	
	public String add() {
		this.result = this.getNumber1() + this.getNumber2();
		return "";
	}
	
	public Double getNumber1() {
		return number1;
	}
	public void setNumber1(Double number1) {
		this.number1 = number1;
	}
	public Double getNumber2() {
		return number2;
	}
	public void setNumber2(Double number2) {
		this.number2 = number2;
	}

	public String[] getOperators() {
		return operators;
	}

	public Double getResult() {
		return result;
	}

	public void setResult(Double result) {
		this.result = result;
	}

}
