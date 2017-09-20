package com.home.accounting.accounts.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Service;

import com.home.accounting.accounts.dtos.AccountDetailsDto;
import com.home.accounting.accounts.dtos.AccountDto;
import com.home.accounting.accounts.model.Account;
import com.home.accounting.accounts.model.IAccount;
import com.home.accounting.accounts.repositories.AccountRepository;

@Service
public class AccountService implements IAccountService {

	@Autowired
	AccountRepository accountRepository;
		
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
	public AccountDetailsDto createAccount(AccountDto accountDto) {
		Account account = conversionService.convert(accountDto, Account.class);
		Account createdAccount = accountRepository.save(account);
		
		AccountDetailsDto accountDetails = conversionService.convert(createdAccount, AccountDetailsDto.class);
		
		return accountDetails;
	}

	public List<AccountDetailsDto> getAllAccounts() {
		
		return null;
	}

	public void deleteAccount(long accountId) {
		
	}

	public List<AccountDetailsDto> getAccountWithName(String name) {
		
		return null;
	}

	public AccountDetailsDto updateBalance(long id, Double newBalance) {
		// TODO Auto-generated method stub
		return null;
	}

	public AccountDetailsDto updateAccount(AccountDto updatedAccountDetails) {
		// TODO Auto-generated method stub
		return null;
	}

}
