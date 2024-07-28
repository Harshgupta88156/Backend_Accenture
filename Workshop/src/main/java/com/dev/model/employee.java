package com.dev.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class employee {
	@Id
    private int empId;
    private String empName;
    private String joiningDate;
    private String role;
    private Integer totalWorkedHours;
    private String jobTitle;
    private String department;
    private String employmentType;
    private String dateOfJoining;
    private String skillLevel;
    private int payRate;
    private Integer standardWorkHours;
    private String certifications;
 
	public employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public employee(int empId, String empName, String joiningDate, String role, Integer totalWorkedHours,
			String jobTitle, String department, String employmentType, String dateOfJoining, String skillLevel,
			int payRate, Integer standardWorkHours, String certifications) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.joiningDate = joiningDate;
		this.role = role;
		this.totalWorkedHours = totalWorkedHours;
		this.jobTitle = jobTitle;
		this.department = department;
		this.employmentType = employmentType;
		this.dateOfJoining = dateOfJoining;
		this.skillLevel = skillLevel;
		this.payRate = payRate;
		this.standardWorkHours = standardWorkHours;
		this.certifications = certifications;
	
	}
	@Override
	public String toString() {
		return "employee [empId=" + empId + ", empName=" + empName + ", joiningDate=" + joiningDate + ", role=" + role
				+ ", totalWorkedHours=" + totalWorkedHours + ", jobTitle=" + jobTitle + ", department=" + department
				+ ", employmentType=" + employmentType + ", dateOfJoining=" + dateOfJoining + ", skillLevel="
				+ skillLevel + ", payRate=" + payRate + ", standardWorkHours=" + standardWorkHours + ", certifications="
				+ certifications + ", totalWorkedhours="+ "]";
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getJoiningDate() {
		return joiningDate;
	}
	public void setJoiningDate(String joiningDate) {
		this.joiningDate = joiningDate;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public Integer getTotalWorkedHours() {
		return totalWorkedHours;
	}
	public void setTotalWorkedHours(Integer totalWorkedHours) {
		this.totalWorkedHours = totalWorkedHours;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getEmploymentType() {
		return employmentType;
	}
	public void setEmploymentType(String employmentType) {
		this.employmentType = employmentType;
	}
	public String getDateOfJoining() {
		return dateOfJoining;
	}
	public void setDateOfJoining(String dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	public String getSkillLevel() {
		return skillLevel;
	}
	public void setSkillLevel(String skillLevel) {
		this.skillLevel = skillLevel;
	}
	public int getPayRate() {
		return payRate;
	}
	public void setPayRate(int payRate) {
		this.payRate = payRate;
	}
	public Integer getStandardWorkHours() {
		return standardWorkHours;
	}
	public void setStandardWorkHours(Integer standardWorkHours) {
		this.standardWorkHours = standardWorkHours;
	}
	public String getCertifications() {
		return certifications;
	}
	public void setCertifications(String certifications) {
		this.certifications = certifications;
	}
	

    // Getters and Setters
}