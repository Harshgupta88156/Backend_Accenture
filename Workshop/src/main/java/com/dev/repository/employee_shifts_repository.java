package com.dev.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.model.employee;
import com.dev.model.employee_shifts;

public interface employee_shifts_repository extends JpaRepository<employee_shifts, Integer> {

}
