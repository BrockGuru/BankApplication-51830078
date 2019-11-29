package com.bookapp.persistence;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.*;
@Repository
public class CustomerDaoImpl implements CustomerDao{
	@Autowired
private SessionFactory factory;
	
	private Session getSession()
	{
		return factory.getCurrentSession();
	}

	@Override
	public List<Customer> getAllCustomer() {
		List<Customer>customer=getSession().createQuery("from Customer").list();
		return customer;
	}

	@Override
	public Customer getUserById(int cusId) {
	Customer customer=(Customer) getSession().get(Customer.class,cusId);
		return customer;
	}

	@Override
	public Customer addCustomer(Customer customer) {
		getSession().save(customer);
		return customer;
	}

	@Override
	public Customer updateCustomer(Customer customer) {
	getSession().update(customer);
		return customer;
	}

	@Override
	public Customer removeCustomer(int cusId) {
	Customer customerIdtobedeleted=null;
	customerIdtobedeleted=getUserById(cusId);
	getSession().delete(customerIdtobedeleted);
		return customerIdtobedeleted;
	}
	

}
