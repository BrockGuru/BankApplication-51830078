package com.bookapp.service;

import java.util.List;

import com.bookapp.persistence.Customer;

public interface CustomerService {
	public List<Customer> getAllCustomer();
	public Customer getUserById(int cusId);
	public Customer addCustomer(Customer customer);
	public Customer updateCustomer(Customer customer);
	public Customer removeCustomer(int cusId);
}
