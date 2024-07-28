package com.dev.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;



@Entity
public class task {
 @Id
 int task_id;
 String task_name;
 int percentage;
 int status;
public task() {
	super();
	// TODO Auto-generated constructor stub
}
public task(int task_id, String task_name, int percentage, int status) {
	super();
	this.task_id = task_id;
	this.task_name = task_name;
	this.percentage = percentage;
	this.status = status;
}
@Override
public String toString() {
	return "task [task_id=" + task_id + ", task_name=" + task_name + ", percentage=" + percentage + ", status=" + status
			+ "]";
}
public int getTask_id() {
	return task_id;
}
public void setTask_id(int task_id) {
	this.task_id = task_id;
}
public String getTask_name() {
	return task_name;
}
public void setTask_name(String task_name) {
	this.task_name = task_name;
}
public int getPercentage() {
	return percentage;
}
public void setPercentage(int percentage) {
	this.percentage = percentage;
}
public int getStatus() {
	return status;
}
public void setStatus(int status) {
	this.status = status;
}


}
