package com.Banking.Employee.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Banking.Employee.Entity.Account;

public interface AccountRepo extends JpaRepository<Account, Long>{

}
