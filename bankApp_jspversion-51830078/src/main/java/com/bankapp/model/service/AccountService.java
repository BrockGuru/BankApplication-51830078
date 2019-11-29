package com.bankapp.model.service;

import java.util.List;

import com.bankapp.model.entities.Account;
import com.bankapp.model.entities.AccountTransaction;
import com.bankapp.model.entities.Customer;


public interface AccountService {
	void blockAccount(Long accountNumber);
    Account createAccount(Account account );
    Account UpdateAccount(Long AccountNumber,com.bankapp.model.formbean.UpdateAccount req);
    public void deleteAccount(Long accountNumber);
    void deposit(Long accountNumber, double amount,String name);
    void withdraw(Long accountNumber, double amount);
    Account transfer(Long fromAccNumber, Long toAccNumber, double amount);
    public	List<AccountTransaction>  cheackAllTransactionByAccountNumber(long accountNumber);
    public List<Account>getAllAccounter();

}
