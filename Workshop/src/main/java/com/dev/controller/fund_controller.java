package com.dev.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dev.model.funds;
import com.dev.service.funds_service;
import com.dev.service.funds_service_Impl;

@RestController
@CrossOrigin
@RequestMapping("/funds")
public class fund_controller {
	
	funds_service_Impl f;

	public fund_controller(funds_service_Impl f) {
		super();
		this.f = f;
	}
	
	@GetMapping
	public List<funds> getall()
	{
		return f.getallfunds();
	}

}
