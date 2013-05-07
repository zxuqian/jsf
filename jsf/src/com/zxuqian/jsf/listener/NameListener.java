package com.zxuqian.jsf.listener;

import javax.faces.event.AbortProcessingException;
import javax.faces.event.ValueChangeEvent;
import javax.faces.event.ValueChangeListener;

public class NameListener implements ValueChangeListener {

	@Override
	public void processValueChange(ValueChangeEvent event)
			throws AbortProcessingException {
		System.out.println("---------------值变化监听器----------------");
		System.out.println(event.getNewValue());
		System.out.println("---------------值变化监听器end-------------");
	}

}
