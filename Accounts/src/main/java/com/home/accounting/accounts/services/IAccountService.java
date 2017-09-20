package com.home.accounting.accounts.services;

import java.util.List;

import com.home.accounting.accounts.dtos.AccountDetailsDto;
import com.home.accounting.accounts.dtos.AccountDto;

public interface IAccountService {

	public AccountDetailsDto createAccount(AccountDto accountDto);
	
	public List<AccountDetailsDto> getAllAccounts();

	public void deleteAccount(long accountId);

	public List<AccountDetailsDto> getAccountWithName(String name);
	
}
