package com.Banking.Employee.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Banking.Employee.DTOS.AccountDto;
import com.Banking.Employee.Service.AccountService;

@RestController
@RequestMapping("api/Account")


public class AccountController {
	
	@Autowired
	private AccountService accountService;
	
	
	@PostMapping("/Create/{custId}")
	public ResponseEntity<AccountDto> createAccount(@PathVariable int custId,@RequestBody AccountDto accountDto ) {
		
		
		return new ResponseEntity<AccountDto>(accountService.create(custId,accountDto),HttpStatus.CREATED);
	}

}
