package com.bookapp.persistence;

import java.util.List;

public interface CustomerDao {
	public List<Customer> getAllCustomer();
	public Customer getUserById(int cusId);
	public Customer addCustomer(Customer customer);
	public Customer updateCustomer(Customer customer);
	public Customer removeCustomer(int cusId);
}
