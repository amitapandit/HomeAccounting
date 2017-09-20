package com.home.accounting.accounts.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AccountDto {

	final private String name;
	
	final private String description;
	
	final private String status;
	
	final private String type;
	
	private double balance;
	
	private long id;
}
