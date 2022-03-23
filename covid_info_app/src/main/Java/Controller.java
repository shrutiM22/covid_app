package main.Java;

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
	//@RequestMapping("/submit")
	public ModelAndView covidData(HttpServletRequest request,HttpServletResponse response) throws ClassNotFoundException, SQLException {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("display.jsp");

		
		return mv;
	
}
	

}
