package com.zxuqian.jsf.listener;

import javax.faces.event.AbortProcessingException;
import javax.faces.event.ActionEvent;
import javax.faces.event.ActionListener;

public class InfoActionLisener implements ActionListener {

	@Override
	public void processAction(ActionEvent event) throws AbortProcessingException {
		System.out.println("--------------动作监听器---------------");
		System.out.println(event.getSource());
		System.out.println(event.getComponent().getId());
		System.out.println("--------------动作监听器end------------");

	}

}
