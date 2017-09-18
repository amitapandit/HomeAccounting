package com.home.accounting.accounts.model;

public interface IAccount {

	public IAccount createAccount();
	
	public boolean deleteAccount(String accountId);
	
	public IAccount updateAccount(IAccount updatedAccountDetails);
	
	public double getBalance();
	
	public boolean setBalance();
	
	public String getName();
	
	public String getDescription();
	
	public String getType();
	
	public String getStatus();
	
	public long getId();
	
}
