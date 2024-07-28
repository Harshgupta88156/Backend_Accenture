package com.dev.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dev.model.data1;
import com.dev.model.employee;
import com.dev.model.funds;

public interface funds_service {

	public List<funds> getallfunds();
	
	//public employee getemployeebyID(int id);
	
//	public   List<employee> getallemployeebyworkedhour(String field);
	
}
