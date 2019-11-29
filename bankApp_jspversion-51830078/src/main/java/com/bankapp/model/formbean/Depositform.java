package com.bankapp.model.formbean;

public class Depositform {
	private long accountnumber;
	private double amount;
	public Depositform(long accountnumber, double amount) {
		
		this.accountnumber = accountnumber;
		this.amount = amount;
	}
	public long getAccountnumber() {
		return accountnumber;
	}
	public void setAccountnumber(long accountnumber) {
		this.accountnumber = accountnumber;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public Depositform() {
		
	}
	
	

}
