package hello.di;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class Test {
	
	@Inject
	private Greeting greeting;
	
	public String greet() {
		System.out.println(greeting.greet("xxxxxxxxxxxxxxxx"));
		return "index";
	}

}
