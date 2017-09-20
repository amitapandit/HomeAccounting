package com.home.accounting.accounts.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class AccountDetailsDto {

		@Getter
		final private String name;
		
		@Getter
		final private String description;
		
		@Getter
		final private String status;
		
		@Getter
		final private String type;
		
		@Getter
		final private double balance;
		
		@Getter
		final private long id; 
}
