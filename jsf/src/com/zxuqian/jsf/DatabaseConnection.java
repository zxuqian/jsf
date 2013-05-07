package com.zxuqian.jsf;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

@ManagedBean
@SessionScoped
public class DatabaseConnection {
	
	public String getCustomers() {
		try {
			InitialContext ic = new InitialContext();
			DataSource ds = (DataSource)ic.lookup("oracle_jndi");
			
			Connection conn = ds.getConnection();
			String sql = "select * from customers";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.executeQuery();
			
			ResultSet rs = ps.getResultSet();
			while(rs.next()) {
				System.out.println(rs.getInt("id"));
				System.out.println(rs.getString("name"));
				System.out.println(rs.getString("salary"));
				System.out.println("xxxxxxxxxxxxxxxxxxxxx");
			}
			
		} catch (NamingException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return "index";
	}

}
