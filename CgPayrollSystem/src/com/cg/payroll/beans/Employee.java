package com.cg.payroll.beans;

public class Employee {
	int id;
	private String firstName,lastname,emaiId,panCard,department,designation;
	private BankDetail bankDetails;
	private Salary salary;
	public Employee(){}
	public Employee(int id, String firstName, String lastname, String emaiId, String panCard, String department,
			String designation, BankDetail bankDetails, Salary salary) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastname = lastname;
		this.emaiId = emaiId;
		this.panCard = panCard;
		this.department = department;
		this.designation = designation;
		this.bankDetails = bankDetails;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmaiId() {
		return emaiId;
	}
	public void setEmaiId(String emaiId) {
		this.emaiId = emaiId;
	}
	public String getPanCard() {
		return panCard;
	}
	public void setPanCard(String panCard) {
		this.panCard = panCard;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public BankDetail getBankDetails() {
		return bankDetails;
	}
	public void setBankDetails(BankDetail bankDetails) {
		this.bankDetails = bankDetails;
	}
	public Salary getSalary() {
		return salary;
	}
	public void setSalary(Salary salary) {
		this.salary = salary;
	}
	
	
	

}
