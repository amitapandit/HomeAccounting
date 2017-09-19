package com.home.accounting.accounts.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.home.accounting.accounts.dtos.AccountDto;
import com.home.accounting.accounts.model.IAccount;

public class AccountManagementTests {


	@Autowired
	AccountService myAccountService;
	

	private AccountDto createWalletAccount01() {
		String accountName = "myWallet01";
		String accountDescription = "My Wallet account 01...";
		String accountStatus = "active";
		String accountType = "wl";
		AccountDto accountDto = new AccountDto(accountName, accountDescription, accountStatus, accountType);
		return accountDto;
	}
	
	private AccountDto createWalletAccount02() {
		String accountName = "myWallet02";
		String accountDescription = "My Wallet account 02...";
		String accountStatus = "active";
		String accountType = "wl";
		AccountDto accountDto = new AccountDto(accountName, accountDescription, accountStatus, accountType);
		return accountDto;
	}
	
	private AccountDto createSavingsBankAccount01() {
		String accountName = "mySavingsBank01";
		String accountDescription = "My savings bank account 01...";
		String accountStatus = "active";
		String accountType = "sb";
		AccountDto accountDto = new AccountDto(accountName, accountDescription, accountStatus, accountType);
		return accountDto;
	}
	
	
	@Test
	public void createAccount() {
		
		AccountDto accountDto = createWalletAccount01();
		myAccountService.createAccount(accountDto);
		List<IAccount> accountsList = myAccountService.getAllAccounts();
	
		boolean accountCreated = false;
		for(IAccount account: accountsList) {
			if( (account.getName().equals(accountDto.getName())) && 
					(account.getId() > 0) ) {
				accountCreated = true;
			}
		}
		
		
		Assert.assertTrue(accountCreated);
		
	}
	
	
	@Test
	public void validateCreationOfAccountOfTypeWallet() {
		AccountDto accountDto = createWalletAccount01();
		myAccountService.createAccount(accountDto);
		List<IAccount> accountsList = myAccountService.getAllAccounts();
	
		boolean accountCreated = false;
		for(IAccount account: accountsList) {
			if( (account.getName().equals(accountDto.getName())) && 
					(account.getId() > 0) ) {
				accountCreated = true;
			}
		}
		
		Assert.assertTrue(accountCreated);
	}
	
	@Test
	public void validateCreationOfAccountOfTypeSavingsBank() {
		AccountDto accountDto = createSavingsBankAccount01();
		myAccountService.createAccount(accountDto);
		List<IAccount> accountsList = myAccountService.getAllAccounts();
	
		boolean accountCreated = false;
		for(IAccount account: accountsList) {
			if( (account.getName().equals(accountDto.getName())) && 
					(account.getId() > 0) ) {
				accountCreated = true;
			}
		}
		
		
		Assert.assertTrue(accountCreated);
	}
	
	@Test
	public void validateIfAccountsOfAllTypesAreReturned() {
		
	}
	
	@Test
	public void validateIfAccountCanBeDeleted() {
		
	}
	
	@Test
	public void validateIfTwoAccountsWithSameDetailsCanBeCreated() {
		
	}
}
