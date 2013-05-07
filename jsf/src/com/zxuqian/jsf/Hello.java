package com.zxuqian.jsf;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class Hello {
	
	private String name;
	private final String helloWorld = "Hello World!";
	
	public Hello() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getHelloWorld() {
		return helloWorld;
	}
	
	
	/**
	 * 测试自定义转换器用
	 * @return
	 */
	public String converterSubmit() {
		
		if(name.contains("zxuqian")) {
			return "response";
		} else {
			return "index";
		}
		
	}
	
	/**
	 * 测试自定义组件的EL方法用
	 */
	public void display() {
		System.out.println("这是自定义组件调用的方法");
	}

}
