package com.home.accounting.accounts.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.home.accounting.accounts.dtos.AccountDto;
import com.home.accounting.accounts.model.IAccount;

public class TestAccounts {

	
	@Autowired
	AccountService myAccountService;
	

	@Test
	public void testCreateAccount() {
		
		
		String accountName = "myWallet";
		String accountDescription = "My Wallet account...";
		String accountStatus = "active";
		String accountType = "wl";
		AccountDto accountDto = new AccountDto(accountName, accountDescription, accountStatus, accountType);
		
		IAccount testAccount = myAccountService.createAccount(accountDto);
		
		Assert.assertNotNull(testAccount);
		
	}
}
