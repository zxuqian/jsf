package com.ejb.client;
//import java.util.Hashtable;
//
//import javax.naming.Context;
//import javax.naming.InitialContext;
//import javax.naming.NamingException;
//
//import com.zxuqian.ejb.Demo;
//
//
//
//public class Main {
//	
//	//@EJB
//	//private static Demo ds;
//	
//	public static void main(String[] args) {
//		//System.out.println(ds.sayHello());
//		Hashtable env = new Hashtable();
//		env.put(Context.INITIAL_CONTEXT_FACTORY, "weblogic.jndi.WLInitialContextFactory");
//		env.put(Context.PROVIDER_URL, "t3://localhost:7001");
//		try {
//			InitialContext ic = new InitialContext(env);
//			Demo demo = (Demo)ic.lookup("java:global/aaa/aaaEJB/DemoImpl");
//			System.out.println(demo.sayHello());
//			
//		} catch (NamingException e) {
//			e.printStackTrace();
//		} 
//	}
//
//	/* (non-Java-doc)
//	 * @see java.lang.Object#Object()
//	 */
//	public Main() {
//		super();
//	}
//
//}