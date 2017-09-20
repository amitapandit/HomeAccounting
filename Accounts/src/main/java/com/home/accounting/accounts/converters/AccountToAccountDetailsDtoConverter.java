package com.home.accounting.accounts.converters;

import org.springframework.core.convert.converter.Converter;

import com.home.accounting.accounts.dtos.AccountDetailsDto;
import com.home.accounting.accounts.model.Account;

public class AccountToAccountDetailsDtoConverter implements Converter<Account, AccountDetailsDto> {

	@Override
	public AccountDetailsDto convert(Account source) {
		AccountDetailsDto accountDetails = new AccountDetailsDto(source.getName(), source.getDescription(),
				source.getStatus(), source.getType(), source.getBalance(), source.getId());
		return accountDetails;
	}

}
