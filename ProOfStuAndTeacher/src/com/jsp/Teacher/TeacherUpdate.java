package com.jsp.Teacher;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TeacherUpdate {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/javabatch";
		String username="root";
		String password="root";
		
		String sql="UPDATE teacher SET Subject='RUBY' WHERE ID=1";
		Connection connection=null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection=DriverManager.getConnection(url, username, password);
			Statement statement= connection.createStatement();
			int a=statement.executeUpdate(sql);
			if(a>0) {
				System.out.println("Data Update");
			}else {
				System.out.println("Not Update");
			}
			System.out.println("all good");
			connection.close();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
