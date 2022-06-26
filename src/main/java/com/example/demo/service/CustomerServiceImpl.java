package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Customer;
import com.example.demo.repository.CustomerRepository;
@Service
public class CustomerServiceImpl implements CustomerService {
private CustomerRepository customerRepository;

	public CustomerServiceImpl(CustomerRepository customerRepository) {
	super();
	this.customerRepository = customerRepository;
}

	@Override
	public Customer getCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerRepository.save(customer) ;
	}

	@Override
	public List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
		return customerRepository.findAll();
	}

}
