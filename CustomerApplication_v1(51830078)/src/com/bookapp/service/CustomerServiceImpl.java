package com.bookapp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.bookapp.persistence.Customer;
import com.bookapp.persistence.CustomerDao;
@Service
@Transactional
public class CustomerServiceImpl implements CustomerService{
	@Autowired
	private CustomerDao dao;

	@Override
	public List<Customer> getAllCustomer() {
		
		return dao.getAllCustomer();
	}

	@Override
	public Customer getUserById(int cusId) {
		Customer customer=dao.getUserById(cusId);
		if(customer==null)
		{
			throw new CustomerNotFound("customer with id:"+cusId+
					"is not found");
			
		}
		return customer;
	}

	@Override
	public Customer addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return dao.addCustomer(customer);
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return dao.updateCustomer(customer);
	}

	@Override
	public Customer removeCustomer(int cusId) {
		// TODO Auto-generated method stub
		return dao.removeCustomer(cusId);
	}

}
