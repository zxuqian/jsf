package com.zxuqian.jsf.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter("simp")
public class SimpleConverter implements Converter {

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String newValue) {
		
		System.out.println("获取传进来的String：" + newValue);
		
		String convertedString = "Converted: " + newValue;
		
		return convertedString;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		
		String newValue = (String) value;
		newValue = newValue.replace("Converted: ", "xxxx");
		
		System.out.println("传回去的String： " + newValue);
		
		return newValue;
	}

}
