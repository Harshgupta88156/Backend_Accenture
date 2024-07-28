package com.dev.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class employee_shifts {
	
	@Id
	int shift_id;
	int emp_id;
	String date;
	String start_time;
	String end_time;
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getStart_time() {
		return start_time;
	}
	public void setStart_time(String start_time) {
		this.start_time = start_time;
	}
	public String getEnd_time() {
		return end_time;
	}
	public void setEnd_time(String end_time) {
		this.end_time = end_time;
	}
	@Override
	public String toString() {
		return "employee_shifts [emp_id=" + emp_id + ", date=" + date + ", start_time=" + start_time + ", end_time="
				+ end_time + "]";
	}
	public employee_shifts() {
		super();
		// TODO Auto-generated constructor stub
	}
	public employee_shifts(int emp_id, String date, String start_time, String end_time) {
		super();
		this.emp_id = emp_id;
		this.date = date;
		this.start_time = start_time;
		this.end_time = end_time;
	}

}
