package com.zxuqian.jsf.validator;

import javax.faces.component.StateHolder;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator("myvalidator")
public class MyValidator implements Validator, StateHolder {

	@Override
	public boolean isTransient() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void restoreState(FacesContext arg0, Object arg1) {
		// TODO Auto-generated method stub

	}

	@Override
	public Object saveState(FacesContext arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setTransient(boolean arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void validate(FacesContext arg0, UIComponent arg1, Object arg2)
			throws ValidatorException {
		// TODO Auto-generated method stub

	}

}
