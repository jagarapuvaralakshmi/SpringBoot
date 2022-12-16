package com.Banking.Employee.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpStatusCodeException;

import com.Banking.Employee.DTOS.CustomerDto;
import com.Banking.Employee.Service.CustomerService;

@RestController
@RequestMapping("/api/Banking")
public class CustomerController {

	//@Autowired
	//private CustomerRepo customerRepo;
	
	@Autowired
	private CustomerService  customerService;

	@PostMapping("/Register")
	public ResponseEntity<CustomerDto> createCustReg(@RequestBody CustomerDto customerDto) {
		
		return new ResponseEntity<CustomerDto>(customerService.custReg(customerDto),HttpStatus.CREATED);
		//System.out.println("2222222222222222"+customer);
		//custReg(customerDto);
		//return  null;
	}

}
