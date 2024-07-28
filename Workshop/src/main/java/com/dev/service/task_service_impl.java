package com.dev.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dev.model.task;
import com.dev.repository.task_repository;
@Service
public class task_service_impl implements task_service {

	task_repository tres;
	
	public task_service_impl(task_repository tres) {
		super();
		this.tres = tres;
	}

	@Override
	public List<task> getalltask() {
		return tres.findByStatus(1);
	}

	@Override
	public task gettaskbyID(int id) {
		
		return tres.findById(id).get();
	}

	@Override
	public int progress(int id) {
		task tt=tres.findById(id).get();
		if(tt.getStatus()==1)
		{
			return tt.getPercentage();	
		}
		return 0;
		
	}

	@Override
	public int updateprogress(int id) {
		task tt=tres.findById(id).get();
		tt.setStatus(1);
		if(tt.getPercentage()<67)
		{
		tt.setPercentage(tt.getPercentage()+33);
		}
		else
		{
			tt.setPercentage(100);
		}
		tres.save(tt);
		return 0;
	}
	@Override
	public void deletetask(int id) {
		tres.deleteById(id);;
	
	}

	
	

}
