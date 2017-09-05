package com.home.accounting.accounts.services;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.home.accounting.accounts.dtos.AccountDto;

public class TestAccounts {

	@Test
	public void testCreateAccount() {
		
		AccountDto accountDto = new AccountDto();
		
		Assert.assertNotNull(accountDto);
		
	}
}
