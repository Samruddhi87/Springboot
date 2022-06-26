package com.example.demo.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Customer;
import com.example.demo.service.CustomerService;

@RestController
@RequestMapping("api")
public class CustomerController {
private CustomerService customerSevice;

public CustomerController(CustomerService customerSevice) {
	super();
	this.customerSevice = customerSevice;
}

@PostMapping()
public ResponseEntity<Customer> getCutomer(@RequestBody Customer customer){
	return new ResponseEntity<Customer>(customerSevice.getCustomer(customer),HttpStatus.CREATED);
}
@GetMapping
public List<Customer> getAllCustomer(){
	return customerSevice.getAllCustomer();
}
}
