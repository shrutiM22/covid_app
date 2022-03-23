package com.cvd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class App {
	public static void main(String[] args) throws SQLException , ClassNotFoundException {
		
		//QueryParameter q = new QueryParameter();
		
		String driverName = "org.postgresql.Driver";
		Class.forName(driverName);
		Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","test");
		Statement stmt=con.createStatement();
		ResultSet r =stmt.executeQuery("SELECT location, total_cases FROM covid_data WHERE new_cases> 1000 GROUP BY location,new_cases,total_cases ORDER BY  new_cases;");
		while(r.next()) {
			System.out.println( r.getString(1) + " " + r.getString(2)  );
			
			
			
			
		}
		
		
		
		
		
	}
}



