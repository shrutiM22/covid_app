package main.Java;

//import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@org.springframework.stereotype.Controller
public class Controller {
	@RequestMapping("/submit")
	public ModelAndView covidData(HttpServletRequest request,HttpServletResponse response) throws ClassNotFoundException, SQLException {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("display.jsp");

		Class.forName("org.postgresql.Driver");
		Connection conn=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","test");
		Statement stmt= conn.createStatement();
		ResultSet r=stmt.executeQuery("SELECT location,total_cases FROM covid_data WHERE new_cases> 1000 GROUP BY location,total_cases ORDER BY total_cases;");
		
		while(r.next()) {
		mv.addObject("location",r.getString(1));
		mv.addObject("cases",r.getString(2));
		}
		return mv;
	
}
	

}
