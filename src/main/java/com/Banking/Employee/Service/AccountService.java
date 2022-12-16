package com.Banking.Employee.Service;

import java.util.List;

import com.Banking.Employee.DTOS.AccountDto;




public interface AccountService {
	
	//public AccountDto accRegToCust(long custId, AccountDto accountDto);
	
	public List<AccountDto> getAllAccountDetails(long custId);

	public AccountDto create(int custId, AccountDto accountDto);

}
