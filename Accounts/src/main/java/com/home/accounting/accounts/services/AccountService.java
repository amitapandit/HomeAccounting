package com.home.accounting.accounts.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.home.accounting.accounts.dtos.AccountDto;
import com.home.accounting.accounts.entities.Account;
import com.home.accounting.accounts.entities.IAccount;
import com.home.accounting.accounts.repositories.AccountRepository;

@Service
public class AccountService implements IAccountService {

	@Autowired
	AccountRepository accountRepository;

	/**
	 * Create an account with following data
	 * <ol>
	 * <li>Account Name</li>
	 * <li>Account Type</li>
	 * <ul>
	 * <li>Wallet : 1</li>
	 * <li>Savings Bank : 2</li>
	 * <li>Band FD : 3</li>
	 * </ul>
	 * </ol>
	 */
	public IAccount createAccount(AccountDto accountDto) {
		IAccount account = new Account(accountDto.getName(), accountDto.getDescription(), accountDto.getStatus(),
				accountDto.getType());
		accountRepository.save(account);
		return account;
	}

}
