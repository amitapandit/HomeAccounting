package com.home.accounting.accounts.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

import com.home.accounting.accounts.dtos.AccountDto;

import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Entity
public class Account {

	public Account(String name, String description, String status, String type, double balance) {
		super();
		this.name = name;
		this.description = description;
		this.status = status;
		this.type = type;
		this.balance = balance;
	}

	@Getter
	private final String name;
	
	@Getter
	private final String description;
	
	@Getter
	private final String status;
	
	@Getter
	private final String type;
	
	@Getter
	private final double balance;

	@Id
	@GeneratedValue
	@Getter
	private long id;
	

//	@Override
//	public IAccount createAccount() {
//		//Validate account DTO before invoking save on Account Entity
//		
//		return null;
//	}
//
//	@Override
//	public boolean deleteAccount(String accountId) {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//	@Override
//	public IAccount updateAccount(IAccount updatedAccountDetails) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public String getName() {
//		// TODO Auto-generated method stub
//		return this.name;
//	}
//
//	@Override
//	public long getId() {
//		return id;
//	}
//
//	@Override
//	public String getDescription() {
//		return this.description;
//	}
//
//	@Override
//	public String getType() {
//		// TODO Auto-generated method stub
//		return this.type;
//	}
//
//	@Override
//	public String getStatus() {
//		// TODO Auto-generated method stub
//		return this.status;
//	}
//
//	@Override
//	public double getBalance() {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//
//	@Override
//	public boolean setBalance() {
//		// TODO Auto-generated method stub
//		return false;
//	}

}
