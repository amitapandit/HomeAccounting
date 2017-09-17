package com.home.accounting.accounts.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.home.accounting.accounts.entities.IAccount;

public interface AccountRepository extends JpaRepository<IAccount, Long> {

}
