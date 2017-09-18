package com.home.accounting.accounts.entities;

import javax.persistence.Entity;

@Entity
public interface IAccount {

	public IAccount save();
	
	public IAccount update();
}
