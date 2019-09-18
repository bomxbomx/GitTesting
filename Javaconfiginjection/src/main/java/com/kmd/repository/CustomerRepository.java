package com.kmd.repository;

import java.util.List; 
import com.kmd.model.Customer; 
public interface CustomerRepository {  
	List<Customer> findAll(); 
	} 
