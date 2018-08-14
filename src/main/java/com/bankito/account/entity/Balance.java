package com.bankito.account.entity;

public class Balance {
	private long amount;
	
	public Balance(long anAmount) {
		this.amount = anAmount;
	}
	
	public long getAmount() { return this.amount; }
	
	public void setAmount(long anAmount) { anAmount = this.amount; }
}
