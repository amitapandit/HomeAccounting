package com.home.accounting.accounts.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.home.accounting.accounts.services.AccountService;
import com.home.accounting.accounts.services.IAccountService;

@Configuration
public class AccountConfigurations {

	@Bean
	public IAccountService getAccountService() {
		IAccountService accountService = new AccountService();
		System.out.println("Created account service object...");
		return accountService;
	}
	
	
	
}
