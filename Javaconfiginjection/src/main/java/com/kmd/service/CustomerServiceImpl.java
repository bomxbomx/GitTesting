package com.kmd.service;

import java.util.List;

import com.kmd.model.Customer;
import com.kmd.repository.CustomerRepository;

public class CustomerServiceImpl implements CustomerService {
	private CustomerRepository customerRepo;

	public CustomerServiceImpl() {

	}

	public CustomerServiceImpl(CustomerRepository customerRepo) {
		System.out.println("This is constructor injection");
		this.customerRepo = customerRepo;
	}

	public void setCustomerRepo(CustomerRepository customerRepo2) {
		this.customerRepo = customerRepo2;
	}

	@Override
	public List<Customer> findAll() {
		return customerRepo.findAll();
	}

}
