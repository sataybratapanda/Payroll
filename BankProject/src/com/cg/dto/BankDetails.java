
package com.cg.dto;
public class BankDetails 
{
	
	private int accountNumber;
	private String ifscCode,bankName;
	public BankDetails() {
		// TODO Auto-generated constructor stub
	}
	public BankDetails(int accountNumber, String ifscCode, String bankName) {
		super();
		this.accountNumber = accountNumber;
		this.ifscCode = ifscCode;
		this.bankName = bankName;
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getIfscCode() {
		return ifscCode;
	}
	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public void displayBankDetails()
	{
		System.out.println(this.accountNumber+" "+this.ifscCode+" "+this.bankName);
	}

}
