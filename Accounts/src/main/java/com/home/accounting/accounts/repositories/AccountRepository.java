package com.home.accounting.accounts.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.home.accounting.accounts.model.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {

}
