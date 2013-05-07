package com.zxuqian.jsf.custom.action;

import javax.faces.context.FacesContext;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.ActionEvent;
import javax.faces.event.ActionListener;

public class InputTextChangeAction implements ActionListener {

	@Override
	public void processAction(ActionEvent event) throws AbortProcessingException {
		InputAction ia = (InputAction) event;
		String username = ia.getMyComponent().getUsername();
		FacesContext context = FacesContext.getCurrentInstance();
		context.getExternalContext().getSessionMap().put("username", username);
	}

}
