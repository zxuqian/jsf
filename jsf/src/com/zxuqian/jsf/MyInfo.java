package com.zxuqian.jsf;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.component.UIInput;
import javax.faces.component.UIOutput;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.validation.constraints.Size;

import com.zxuqian.domain.Student;

@ManagedBean
@SessionScoped
public class MyInfo {
	
	@Size(min=5)
	private String name;
	private int age;
	private String response;
	private List<Student> students;
	private Date date;
	private boolean agreement;
	private int category;
	private int[] hobbies;
	private String[] bookItems;
	private String[] books;
	private UIOutput dateText;
	
	
	public MyInfo() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isAgreement() {
		return agreement;
	}

	public void setAgreement(boolean agreement) {
		this.agreement = agreement;
	}

	public int getCategory() {
		return category;
	}

	public void setCategory(int category) {
		this.category = category;
	}

	public int[] getHobbies() {
		return hobbies;
	}

	public void setHobbies(int[] hobbies) {
		this.hobbies = hobbies;
	}

	public String getResponse() {
		if(null != name && !"".equals(name)) {
			this.response = "你好，欢迎你，这是你的基本信息！";
		}
		return response;
	}

	public List<Student> getStudents() {
		this.students = new ArrayList<Student>();
		for(int i = 0; i < 10; i++) {
			Student s = new Student();
			s.setName("zhang" + i);
			s.setAge(20 + i);
			s.setScore(90 + i);
			this.students.add(s);
		}
		
		return students;
	}

	public Date getDate() {
		return new Date();
	}
	
	public Integer getPrice() {
		return 30;
	}
	
	public String[] getBookItems() {
		bookItems = new String[]{"Java", "C++", "PHP", "Groovy"};
		return bookItems;
	}

	public String[] getBooks() {
		return books;
	}

	public void setBooks(String[] books) {
		this.books = books;
	}
	

	public UIOutput getDateText() {
		System.out.println("In getDateText^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		if(this.dateText != null) {
			System.out.println("Value of dateText: " + this.dateText.getValue().toString());
		}
		return dateText;
	}

	public void setDateText(UIOutput dateText) {
		System.out.println("In setDateText^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		this.dateText = dateText;
	}

	/**
	 * 监听commandButton (ID: submitButton)
	 * @param event
	 */
	public void submit(ActionEvent event) {
		System.out.println("===============方法中的监听器=============");
		System.out.println(event.getComponent().getId());
		System.out.println("===============方法中的监听器end==========");
		
	}
	
	/**
	 * 表单验证方法
	 * @param context
	 * @param toValidate
	 * @param value
	 */
	public void validateName(FacesContext context, UIComponent toValidate, Object value) {
		System.out.println("================方法里的Validate==================");
		String inputName = (String) value;
		if(inputName.length() > 10) {
			((UIInput) toValidate).setValid(false);
			FacesMessage message = new FacesMessage("请输入小于10个字符");
			context.addMessage(toValidate.getClientId(context), message);
		}
		System.out.println("================方法里的Validate end==============");
	}

}
