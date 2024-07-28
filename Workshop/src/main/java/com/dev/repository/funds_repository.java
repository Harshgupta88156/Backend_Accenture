package com.dev.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.model.employee;
import com.dev.model.funds;

public interface funds_repository extends JpaRepository<funds, Integer> {


}
