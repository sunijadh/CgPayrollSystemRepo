package com.cg.payroll.beans;

public class BankDetail {
	int accoutNo;
	String bankName,IFSCCode;
	public BankDetail(){}
	public BankDetail(int accoutNo, String bankName, String iFSCCode) {
		super();
		this.accoutNo = accoutNo;
		this.bankName = bankName;
		IFSCCode = iFSCCode;
	}
	public int getAccoutNo() {
		return accoutNo;
	}
	public void setAccoutNo(int accoutNo) {
		this.accoutNo = accoutNo;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getIFSCCode() {
		return IFSCCode;
	}
	public void setIFSCCode(String iFSCCode) {
		IFSCCode = iFSCCode;
	}
	

}
