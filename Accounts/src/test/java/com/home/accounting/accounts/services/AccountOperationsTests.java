package com.home.accounting.accounts.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.home.accounting.accounts.dtos.AccountDetailsDto;
import com.home.accounting.accounts.dtos.AccountDto;
import com.home.accounting.accounts.model.IAccount;

public class AccountOperationsTests {

	
	@Autowired
	AccountService myAccountService;
	

	private AccountDto createWalletAccount01() {
		String accountName = "myWallet01";
		String accountDescription = "My Wallet account 01...";
		String accountStatus = "active";
		String accountType = "wl";
		AccountDto accountDto = new AccountDto(accountName, accountDescription, accountStatus, accountType, 100.00, 0);
		return accountDto;
	}
	
	private AccountDto udpatedWalletAccount01() {
		String accountName = "myWallet01";
		String accountDescription = "My Wallet account 01 with description updated...";
		String accountStatus = "active";
		String accountType = "wl";
		AccountDto accountDto = new AccountDto(accountName, accountDescription, accountStatus, accountType, 100.00, 0);
		return accountDto;
	}
	
	private AccountDto udpatedWalletAccountStatus() {
		String accountName = "myWallet01";
		String accountDescription = "My Wallet account 01 with description updated...";
		String accountStatus = "active";
		String accountType = "wl";
		AccountDto accountDto = new AccountDto(accountName, accountDescription, accountStatus, accountType, 100.00, 0);
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
	public void validateIfAccountBalanceReturned() {
		AccountDto accountDto = createWalletAccount01();
		AccountDetailsDto accountDetails = myAccountService.createAccount(accountDto);
		Assert.assertEquals(accountDetails.getBalance(), accountDto.getBalance());
		
		
	}
	
	public void validateIfAccountTypeCanBeChanged() {
		AccountDto accountDto = createWalletAccount01();
		AccountDetailsDto accountDetails = myAccountService.createAccount(accountDto);
		
		Double newBalance = 200.00;
		AccountDetailsDto accountDetailsPostbalanceUpdate = myAccountService.updateBalance(accountDetails.getId(), newBalance);
		Assert.assertEquals(accountDetailsPostbalanceUpdate.getBalance(), newBalance);
	}
	
	public void validateIfAccountDescriptionCanBeUpdated() {
		AccountDto accountDto = createWalletAccount01();
		AccountDetailsDto accountDetails = myAccountService.createAccount(accountDto);
		
		AccountDto updatedAccountDto = udpatedWalletAccount01();
		AccountDetailsDto updatedAccountDetails = myAccountService.updateAccount(updatedAccountDto);
		
		Assert.assertEquals(updatedAccountDetails.getDescription(), updatedAccountDto.getDescription());
	}
	
	public void validateIfAccountStatusCanBeChanged() {
		
		AccountDto accountDto = createWalletAccount01();
		AccountDetailsDto accountDetails = myAccountService.createAccount(accountDto);
		
		AccountDto updatedAccountDto = udpatedWalletAccountStatus();
		
		AccountDetailsDto updatedAccountDetails = myAccountService.updateAccount(updatedAccountDto);
		
		Assert.assertEquals(updatedAccountDetails.getStatus(), updatedAccountDto.getStatus());
	}
}
