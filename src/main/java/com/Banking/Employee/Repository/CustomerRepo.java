package com.Banking.Employee.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Banking.Employee.Entity.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Integer>{
	
	

}
