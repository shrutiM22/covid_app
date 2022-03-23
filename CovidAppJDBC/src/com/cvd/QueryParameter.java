package com.cvd;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="covid_data")
public class QueryParameter {
	
	@Id
	@GeneratedValue
	private int id;
	private String iso_code;
	private String continent;
	private String location;
	private String date;
	private int total_cases;
	private int new_cases;
	
	
	
	public QueryParameter() {
		super();
		// TODO Auto-generated constructor stub
	}

	public QueryParameter(String iso_code, String continent, String location, String date, int total_cases,
			int new_cases) {
		super();
		this.iso_code = iso_code;
		this.continent = continent;
		this.location = location;
		this.date = date;
		this.total_cases = total_cases;
		this.new_cases = new_cases;
	}
	
	public String getIso_code() {
		return iso_code;
	}
	public void setIso_code(String iso_code) {
		this.iso_code = iso_code;
	}
	public String getContinent() {
		return continent;
	}
	public void setContinent(String continent) {
		this.continent = continent;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getTotal_cases() {
		return total_cases;
	}
	public void setTotal_cases(int total_cases) {
		this.total_cases = total_cases;
	}
	public int getNew_cases() {
		return new_cases;
	}
	public void setNew_cases(int new_cases) {
		this.new_cases = new_cases;
	}

	@Override
	public String toString() {
		return "QueryParameter [iso_code=" + iso_code + ", continent=" + continent + ", location=" + location
				+ ", date=" + date + ", total_cases=" + total_cases + ", new_cases=" + new_cases + "]";
	}
	
	
	
	

}
