package com.kmd.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.kmd.model.Customer;

public class CustomerRepositoryImpl implements CustomerRepository {
	
	@Override
	public List<Customer> findAll() {
		List<Customer> customers = new ArrayList<Customer>();   
		Customer customer = new Customer();   
		customer.setFirstName("Thant");   
		customer.setLastName("Thant");   
		customers.add(customer);   
		return customers; 
	}

}
