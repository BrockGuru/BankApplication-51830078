package com.bankapp.model.formbean;

public class AccountTransferForm {
private long fromAcc;
private long toAcc;
private double amount;
public AccountTransferForm(long fromAcc, long toAcc, double amount) {

	this.fromAcc = fromAcc;
	this.toAcc = toAcc;
	this.amount = amount;
}
public long getFromAcc() {
	return fromAcc;
}
public void setFromAcc(long fromAcc) {
	this.fromAcc = fromAcc;
}
public long getToAcc() {
	return toAcc;
}
public void setToAcc(long toAcc) {
	this.toAcc = toAcc;
}
public double getAmount() {
	return amount;
}
public void setAmount(double amount) {
	this.amount = amount;
}
public AccountTransferForm() {
}

}
