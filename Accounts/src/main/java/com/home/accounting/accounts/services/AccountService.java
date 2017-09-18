package com.home.accounting.accounts.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Service;

import com.home.accounting.accounts.dtos.AccountDto;
import com.home.accounting.accounts.model.Account;
import com.home.accounting.accounts.model.IAccount;

@Service
public class AccountService implements IAccountService {

//	@Autowired
//	AccountRepository accountRepository;

	@Autowired
	ConversionService conversionService;
	
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
		IAccount account = conversionService.convert(accountDto, IAccount.class);
		IAccount createdAccount = account.createAccount();
//		accountRepository.save(account);
		return createdAccount;
	}

}
