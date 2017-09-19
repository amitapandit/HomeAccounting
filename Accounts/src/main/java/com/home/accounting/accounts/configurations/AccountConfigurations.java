package com.home.accounting.accounts.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.support.DefaultConversionService;

import com.home.accounting.accounts.converters.AccountDtoToAccountModelConverter;
import com.home.accounting.accounts.entities.Account;
import com.home.accounting.accounts.entities.IAccount;
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
	
	@Bean
	public ConversionService conversionService() {
		DefaultConversionService conversionService = new DefaultConversionService();
		conversionService.addConverter(new AccountDtoToAccountModelConverter());
		return conversionService;
		
	}
	
	
}
