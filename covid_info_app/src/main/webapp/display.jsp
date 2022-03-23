<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Covid related data</title>
</head>
<body>

	<%
	
	
	try {
	Class.forName("org.postgresql.Driver");
	} catch (ClassNotFoundException e) {
	e.printStackTrace();
	}
	Connection connection = null;
	Statement statement = null;
	ResultSet r = null;
	%>


	<h1 style " align="center" padding-top="20px"  ">Covid Data</h1>
	<table style " align= "center" padding-top="20px" border="2" cellpadding="8" ">
		<tr>
			<th>Location</th>
			<th>Total cases</th>
		</tr>
		
		<%
			try{ 
				Connection conn=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","test");
			statement=conn.createStatement();
			String sql ="SELECT location, total_cases FROM covid_data WHERE new_cases> 1000 GROUP BY location,new_cases,total_cases ORDER BY  new_cases;";
			r = statement.executeQuery(sql);
			while(r.next()){
		%>
		<tr>
		
		<td ><%=r.getString(1) %></td>
		<td><%=r.getString(2) %></td>
		
		</tr>
		
		<% 
			}
			} catch (Exception e) {
			e.printStackTrace();
			}
		%>
		
	</table>
	</body>
</html>
	


