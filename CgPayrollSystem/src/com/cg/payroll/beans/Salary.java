package com.cg.payroll.beans;

public class Salary {
  Double basicSalary,hra,conveyenceAllowance,otherAllowence,PersonalAllowence,monthlyTax,epf,companyPf,netSalary;

public Salary() {}

public Salary(Double basicSalary, Double hra, Double conveyenceAllowance, Double otherAllowence,
		Double personalAllowence, Double monthlyTax, Double epf, Double companyPf, Double netSalary) {
	super();
	this.basicSalary = basicSalary;
	this.hra = hra;
	this.conveyenceAllowance = conveyenceAllowance;
	this.otherAllowence = otherAllowence;
	PersonalAllowence = personalAllowence;
	this.monthlyTax = monthlyTax;
	this.epf = epf;
	this.companyPf = companyPf;
	this.netSalary = netSalary;
}

public Double getBasicSalary() {
	return basicSalary;
}

public void setBasicSalary(Double basicSalary) {
	this.basicSalary = basicSalary;
}

public Double getHra() {
	return hra;
}

public void setHra(Double hra) {
	this.hra = hra;
}

public Double getConveyenceAllowance() {
	return conveyenceAllowance;
}

public void setConveyenceAllowance(Double conveyenceAllowance) {
	this.conveyenceAllowance = conveyenceAllowance;
}

public Double getOtherAllowence() {
	return otherAllowence;
}

public void setOtherAllowence(Double otherAllowence) {
	this.otherAllowence = otherAllowence;
}

public Double getPersonalAllowence() {
	return PersonalAllowence;
}

public void setPersonalAllowence(Double personalAllowence) {
	PersonalAllowence = personalAllowence;
}

public Double getMonthlyTax() {
	return monthlyTax;
}

public void setMonthlyTax(Double monthlyTax) {
	this.monthlyTax = monthlyTax;
}

public Double getEpf() {
	return epf;
}

public void setEpf(Double epf) {
	this.epf = epf;
}

public Double getCompanyPf() {
	return companyPf;
}

public void setCompanyPf(Double companyPf) {
	this.companyPf = companyPf;
}

public Double getNetSalary() {
	return netSalary;
}

public void setNetSalary(Double netSalary) {
	this.netSalary = netSalary;
}
  
}
