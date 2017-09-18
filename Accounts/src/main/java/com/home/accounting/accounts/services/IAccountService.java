package com.home.accounting.accounts.services;

import com.home.accounting.accounts.dtos.AccountDto;
import com.home.accounting.accounts.model.IAccount;

public interface IAccountService {

	public IAccount createAccount(AccountDto accountDto);
	
}
