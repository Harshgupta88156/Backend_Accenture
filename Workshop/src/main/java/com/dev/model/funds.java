package com.dev.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class funds {
	@Id
	int fund_id;
	int allocated_funds;
	int worker_expense;
	int resource_expense;
	int other_exepenses;
	int left_funds;
	int task_id;
	String date_of;
	String field_colour;
	String deadline;
	String task_priority;
	String type;
	int emp_id;
	
	public String getField_colour() {
		return field_colour;
	}
	public void setField_colour(String field_colour) {
		this.field_colour = field_colour;
	}
	public String getDeadline() {
		return deadline;
	}
	public void setDeadline(String deadline) {
		this.deadline = deadline;
	}
	public String getTask_priority() {
		return task_priority;
	}
	public void setTask_priority(String task_priority) {
		this.task_priority = task_priority;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public funds(String feild_colour) {
		super();
		this.field_colour = feild_colour;
	}
	public int getFund_id() {
		return fund_id;
	}
	public int getLeft_funds() {
		return left_funds;
	}
	public void setLeft_funds(int left_funds) {
		this.left_funds = left_funds;
	}
	public String getFeild_colour() {
		return field_colour;
	}
	public void setFeild_colour(String feild_colour) {
		this.field_colour = feild_colour;
	}
	public void setFund_id(int fund_id) {
		this.fund_id = fund_id;
	}
	public int getAllocated_funds() {
		return allocated_funds;
	}
	public void setAllocated_funds(int allocated_funds) {
		this.allocated_funds = allocated_funds;
	}
	public int getWorker_expense() {
		return worker_expense;
	}
	public void setWorker_expense(int worker_expense) {
		this.worker_expense = worker_expense;
	}
	public int getResource_expense() {
		return resource_expense;
	}
	public void setResource_expense(int resource_expense) {
		this.resource_expense = resource_expense;
	}
	public int getOther_exepenses() {
		return other_exepenses;
	}
	public void setOther_exepenses(int other_exepenses) {
		this.other_exepenses = other_exepenses;
	}
	
	public int getTask_id() {
		return task_id;
	}
	public void setTask_id(int task_id) {
		this.task_id = task_id;
	}
	public String getDate_of() {
		return date_of;
	}
	public void setDate_of(String date_of) {
		this.date_of = date_of;
	}
	public funds(int fund_id, int allocated_funds, int worker_expense, int resource_expense, int other_exepenses,
			int left, int task_id, String date_of) {
		super();
		this.fund_id = fund_id;
		this.allocated_funds = allocated_funds;
		this.worker_expense = worker_expense;
		this.resource_expense = resource_expense;
		this.other_exepenses = other_exepenses;
		this.left_funds = left;
		this.task_id = task_id;
		this.date_of = date_of;
	}
	public funds(int left_funds) {
		super();
		this.left_funds = left_funds;
	}
	public funds() {
		super();
		// TODO Auto-generated constructor stub
	}

}
