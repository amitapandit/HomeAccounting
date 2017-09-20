package com.home.accounting.accounts.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.home.accounting.accounts.dtos.AccountDto;
import com.home.accounting.accounts.exceptions.DuplicateAccountException;
import com.home.accounting.accounts.model.IAccount;

public class AccountManagementTests {


	@Autowired
	AccountService myAccountService;
	

	private AccountDto createWalletAccount01() {
		String accountName = "myWallet01";
		String accountDescription = "My Wallet account 01...";
		String accountStatus = "active";
		String accountType = "wl";
		AccountDto accountDto = new AccountDto(accountName, accountDescription, accountStatus, accountType, 0.0, 0);
		return accountDto;
	}
	
	private AccountDto createWalletAccount02() {
		String accountName = "myWallet02";
		String accountDescription = "My Wallet account 02...";
		String accountStatus = "active";
		String accountType = "wl";
		AccountDto accountDto = new AccountDto(accountName, accountDescription, accountStatus, accountType, 0.0, 0);
		return accountDto;
	}
	
	private AccountDto createSavingsBankAccount01() {
		String accountName = "mySavingsBank01";
		String accountDescription = "My savings bank account 01...";
		String accountStatus = "active";
		String accountType = "sb";
		AccountDto accountDto = new AccountDto(accountName, accountDescription, accountStatus, accountType, 0.0, 0);
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
		AccountDto accountDto01 = createWalletAccount01();
		myAccountService.createAccount(accountDto01);
		
		AccountDto accountDto02 = createSavingsBankAccount01();
		myAccountService.createAccount(accountDto02);
		
		List<IAccount> accountsList = myAccountService.getAllAccounts();
		boolean account01Created = false;
		boolean account02Created = false;
		
		for(IAccount account: accountsList) {
			if((account.getName().equals(accountDto01.getName()))) {
				account01Created = true;
			} else if((account.getName().equals(accountDto02.getName()))) {
				account02Created = true;
			}
		}
		
		Assert.assertTrue(account01Created && account02Created);
	}
	
	@Test
	public void validateIfAccountCanBeDeleted() {
		AccountDto accountDto = createWalletAccount01();
		myAccountService.createAccount(accountDto);
		List<IAccount> accountsList = myAccountService.getAllAccounts();
		
		for(IAccount account: accountsList) {
			if( (account.getName().equals(accountDto.getName())) && 
					(account.getId() > 0) ) {
				myAccountService.deleteAccount(account);
			}
		}

		boolean accountDeleted = true;
		for(IAccount account: accountsList) {
			if( (account.getName().equals(accountDto.getName())) && 
					(account.getId() > 0) ) {
				accountDeleted = false;
			}
		}
		
		Assert.assertTrue(accountDeleted);
	}
	
	@Test(expectedExceptions = DuplicateAccountException.class)
	public void validateIfTwoAccountsWithSameDetailsCanBeCreated() {
		AccountDto accountDto01 = createWalletAccount01();
		myAccountService.createAccount(accountDto01);
		
		AccountDto accountDto02 = createWalletAccount01();
		myAccountService.createAccount(accountDto02);
		
	}
}
