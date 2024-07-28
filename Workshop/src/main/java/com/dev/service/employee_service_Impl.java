package com.dev.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.dev.model.employee;
import com.dev.repository.employee_repository;
@Service
public class employee_service_Impl implements employee_service {

	employee_repository e;
	
	
	public employee_service_Impl(employee_repository e) {
		super();
		this.e = e;
	}

	@Override
	public List<employee> getallemployee() {
	
		return e.findAll();
	}

	@Override
	public employee getemployeebyID(int id) {
		// TODO Auto-generated method stub
		return e.findById(id).get();
	}


	@Override
	public List<employee> getallemployeebyworkedhour(String field) {
		// TODO Auto-generated method stub
		List<employee> list= new ArrayList<employee>();
		List<employee> lt = e.findAll();
		for(int i=0;i<lt.size();i++) {
			if(lt.get(i).getRole().equals(field)) { 
				list.add(lt.get(i));
				
			}
		}
		
		return list;
	}

}
