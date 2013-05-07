package com.zxuqian.jsf.custom.renderers;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;
import javax.faces.event.ActionListener;
import javax.faces.render.FacesRenderer;
import javax.faces.render.Renderer;

import com.zxuqian.jsf.custom.MyComponent;

@FacesRenderer(componentFamily="output", rendererType="MyOutput")
public class ZlabelRenderer extends Renderer {
	
	/**
	 * encode是把本地变量转换为相应的标签,encodeBegin encodeChild, encodeEnd可以只写一个
	 */
	@Override
	public void encodeBegin(FacesContext context, UIComponent component)
			throws IOException {
		if(context == null) {
			throw new NullPointerException();
		}
		System.out.println("开始编码咯");
		
		MyComponent comp = (MyComponent) component;
		
		System.out.println(comp.toString());
		
		//这个value是自定义组件的value，不是Input的value，只是测试用
		System.out.println("从MyComponent获取EL表达的Value值：" + comp.getValue1() + "username: " + comp.getUsername());
		
		ResponseWriter writer = context.getResponseWriter();
		writer.startElement("label", comp);
		writer.writeAttribute("id", "mylabel", "nested_id");
		writer.writeText("Test!!!!!!!!", null);
		
		
	}
	
	@Override
	public void encodeEnd(FacesContext context, UIComponent component)
			throws IOException {
		if(context == null) {
			throw new NullPointerException();
		}
		
		System.out.println("编码中的context：" + context.toString());
		
		
		MyComponent comp = (MyComponent) component;
		
		//方法EL表达式
		//comp.getAction().getMethodInfo(context.getELContext()).getName();
		ResponseWriter writer = context.getResponseWriter();
		writer.endElement("label");
		writer.startElement("input", comp);
		writer.writeAttribute("id", "username", null);
		writer.writeAttribute("name", "username", null);
		
		writer.writeAttribute("value", comp.getUsername(), null);
		writer.endElement("input");
		
		writer.startElement("input", comp);
		writer.writeAttribute("type", "submit", null);
		writer.writeAttribute("value", "提交", null);
		writer.endElement("input");
		System.out.println("编码结束咯！！！！！！！");
		
	}
	
	@Override
	public void decode(FacesContext context, UIComponent component) {
		if(context == null) {
			throw new NullPointerException();
		}
		String value = "";
		try {
			value = new String(((String) context.getExternalContext().getRequestParameterMap().get("username")).getBytes("ISO-8859-1"), "UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		System.out.println("解码后的username: " + value);
		MyComponent comp = (MyComponent) component;
		comp.setUsername(value);
		System.out.println(context.toString() + " ======decode");
		System.out.println("decode之后：" + context.toString());
		//可以不用显式调用，因为继承了UICommand
		//comp.getActionExpression().invoke(context.getELContext(), null);
		
	}


}
