 	package com.home.accounting.accounts.converters;

import org.springframework.core.convert.converter.Converter;

import com.home.accounting.accounts.dtos.AccountDto;
import com.home.accounting.accounts.model.Account;
import com.home.accounting.accounts.model.IAccount;

public class AccountDtoToAccountModelConverter implements Converter<AccountDto,IAccount> {

	@Override
	public IAccount convert(AccountDto source) {
		return new Account(source.getName(), source.getDescription(), source.getType(), source.getStatus());
	}

}
