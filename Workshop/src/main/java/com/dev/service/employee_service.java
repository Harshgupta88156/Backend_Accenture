package com.dev.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dev.model.employee;

public interface employee_service {

	public List<employee> getallemployee();
	public employee getemployeebyID(int id);
	//public int getemployeebyworkedhour(String field);
	public   List<employee> getallemployeebyworkedhour(String field);
	
}
