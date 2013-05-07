package com.zxuqian.jsf.custom;

import javax.el.MethodExpression;
import javax.faces.component.FacesComponent;
import javax.faces.component.UICommand;
import javax.faces.context.FacesContext;

import com.zxuqian.jsf.custom.action.InputAction;

@FacesComponent("MyOutput")
public class MyComponent extends UICommand {
	
	private String username;
	//private MethodExpression method;
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
		this.queueEvent(new InputAction(this));
	}
	
	/**
	 * 接受EL表达式
	 */
	public String getValue1() {
		System.out.println("调用了getValue1()了吗");
		return (String)this.getStateHelper().eval("value1");
	}

	public void setValue1(String value1) {
		System.out.println("调用了setValue1()了吗");
		this.getStateHelper().put("value1", value1);
	}
	
	/**
	 * EL表达式，方法
	 */
//	public MethodExpression getMethod() {
//		return method;
//	}
//
//	public void setMethod(MethodExpression method) {
//		this.method = method;
//	}
	
	
	public String getFamily() {
		return "output";
	}
	
	
	@Override
	public Object saveState(FacesContext context) {
		Object[] values = new Object[2];
		values[0] = super.saveState(context);
		values[1] = username;
		System.out.println("调用了saveState方法, username=" + username + " context: " + context.toString());
		return values;
	}
	

	@Override
	public void restoreState(FacesContext context, Object state) {
		Object[] values = (Object[]) state;
		super.restoreState(context, values[0]);
		this.username = (String)values[1];
		System.out.println("调用了restoreState方法, username=" + username + " " + values.length);
	}

	@Override
	public String toString() {
		return "MyComponent [username=" + username + "]";
	}
	
}
