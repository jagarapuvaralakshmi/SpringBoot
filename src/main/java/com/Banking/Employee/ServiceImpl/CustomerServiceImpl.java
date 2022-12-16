package com.Banking.Employee.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Banking.Employee.DTOS.CustomerDto;
import com.Banking.Employee.Entity.Customer;
import com.Banking.Employee.Repository.CustomerRepo;
import com.Banking.Employee.Service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerRepo customerRepo;

	@Override
	public CustomerDto custReg(CustomerDto customerDto) {
		Customer customer = custDtoToEntity(customerDto);
		Customer savedCustomer = customerRepo.save(customer);
		CustomerDto convCustomerDto = EntityToCustDto(savedCustomer);
		return convCustomerDto;
	}
	//type casting customerDto to customer
	public Customer custDtoToEntity(CustomerDto customerDto) {
		Customer customer= new Customer();
		customer.setCname(customerDto.getCname());
		customer.setCage(customerDto.getCage());
		customer.setCtype(customerDto.getCtype());
		return customer;
		
	}
////type casting customer to customerDto
	public CustomerDto EntityToCustDto(Customer savedCustomer) {
		CustomerDto customerDto= new CustomerDto();
		customerDto.setCno(savedCustomer.getCno());
		customerDto.setCname(savedCustomer.getCname());
		customerDto.setCage(savedCustomer.getCage());
		customerDto.setCtype(savedCustomer.getCtype());
		return customerDto;
		
	}

}
