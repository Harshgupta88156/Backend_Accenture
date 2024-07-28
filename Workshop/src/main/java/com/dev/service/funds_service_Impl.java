package com.dev.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.dev.model.data1;
import com.dev.model.employee;
import com.dev.model.funds;
import com.dev.repository.employee_repository;
import com.dev.repository.funds_repository;
@Service
public class funds_service_Impl implements funds_service {

	funds_repository f;
	
	
	public funds_service_Impl(funds_repository f) {
		super();
		this.f = f;
	}


	@Override
	public List<funds> getallfunds() {
		// TODO Auto-generated method stub
		return f.findAll();
	}

	}
