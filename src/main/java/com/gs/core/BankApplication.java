package com.gs.core;
/**
*@author:Gaurav Patil
*/

public class BankApplication {
	
	private int custAccountNo = 12345;
	
	private String custPass = "Gaurav";

	public BankApplication(int custAccountNo, String custPass) {
		super();
		this.custAccountNo = custAccountNo;
		this.custPass = custPass;
	}

	public int getCustAccountNo() {
		return custAccountNo;
	}

	public void setCustAccountNo(int custAccountNo) {
		this.custAccountNo = custAccountNo;
	}

	public String getCustPass() {
		return custPass;
	}

	public void setCustPass(String custPass) {
		this.custPass = custPass;
	}
	
	

}
