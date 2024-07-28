package com.dev.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.model.task;

public interface task_repository  extends JpaRepository<task,Integer>{
	List<task> findByStatus(int status);

}
