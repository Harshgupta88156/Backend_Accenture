package com.dev.service;

import java.util.List;

import com.dev.model.task;

public interface task_service {

	public List<task> getalltask();
	public task gettaskbyID(int id);
	public int progress(int id);
	public int updateprogress(int id);
	public void deletetask(int id);
}
