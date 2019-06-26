package com.cg.payroll.main;

import com.cg.payroll.bean.Account;
import com.cg.payroll.beans.*;
public class MainClass {

	public static void main(String[] args)  {
		
		Employee emp=new Employee(100, "Sunil"," jadhav", "sj@gmail.com", "SD367fh", "Java"," Associate",new BankDetail(45463431,"SBI","SBIN0000433"),new Salary());
		
		int eId=emp.getId();
		System.out.println(eId);
		
		int ac=emp.getBankDetails().getAccoutNo();
		System.out.println(ac);
		Account acn=new Account();
		
			
		}
		

	}


