package com.zxuqian.jsf.custom.action;

import javax.faces.event.ActionEvent;

import com.zxuqian.jsf.custom.MyComponent;

public class InputAction extends ActionEvent {

	private static final long serialVersionUID = 6617219090222613055L;

	public InputAction(MyComponent input) {
		super(input);
	}
	
	public MyComponent getMyComponent() {
		return (MyComponent) getComponent();
	}
	
	

}
