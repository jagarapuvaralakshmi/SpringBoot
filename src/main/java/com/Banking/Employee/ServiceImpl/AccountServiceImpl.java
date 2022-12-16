package com.Banking.Employee.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Banking.Employee.DTOS.AccountDto;
import com.Banking.Employee.Entity.Account;
import com.Banking.Employee.Entity.Customer;
import com.Banking.Employee.Repository.AccountRepo;
import com.Banking.Employee.Repository.CustomerRepo;
import com.Banking.Employee.Service.AccountService;

@Service
public class AccountServiceImpl implements AccountService {

	@Autowired
	AccountRepo accountRepo;
	
	@Autowired
	CustomerRepo customerRepo;

	@Override
	public List<AccountDto> getAllAccountDetails(long custId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AccountDto create(int custId, AccountDto accountDto) {
		Customer customer = customerRepo.findById(custId).get();
		System.out.println(customer+"55555555");
		Account account = accDtoToEntity(accountDto);
		account.setCustomer(customer);
		Account savedAccount = accountRepo.save(account);
		AccountDto savedaccountDto = EntityToAccDto(savedAccount);
		return savedaccountDto;
	}

	public Account accDtoToEntity(AccountDto accountDto) {

		Account account = new Account();

		account.setAccName(accountDto.getAccName());

		return account;

	}

//type casting Account to AccountDto
	public AccountDto EntityToAccDto(Account savedAccount) {
		AccountDto accountDto = new AccountDto();

		accountDto.setAccName(savedAccount.getAccName());
		accountDto.setAccNo(savedAccount.getAccNo());

		return accountDto;

	}
}
