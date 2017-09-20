package com.home.accounting.accounts.services;

import java.util.List;

import com.home.accounting.accounts.dtos.AccountDetailsDto;
import com.home.accounting.accounts.dtos.AccountDto;
import com.home.accounting.accounts.model.IAccount;

public interface IAccountService {

	public AccountDetailsDto createAccount(AccountDto accountDto);
	
	public List<IAccount> getAllAccounts();

	public void deleteAccount(IAccount account);

	public List<IAccount> getAccountWithName(String name);
	
}
