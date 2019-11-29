package com.bankapp.model.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.bankapp.model.entities.Account;
import com.bankapp.model.entities.AccountTransaction;
import com.bankapp.model.entities.TransactionLog;
import com.bankapp.model.exceptions.AccountNotfoundEx;
import com.bankapp.model.repository.AccountRepository;
import com.bankapp.model.repository.AccountTransactionRepository;
import com.bankapp.model.repository.CustomerRepository;
import com.bankapp.model.repository.TrannsactionLogRepository;

@Service
@Transactional
public class AccountServiceImpl implements AccountService {
	@Autowired
	private AccountRepository accountRepository;
	@Autowired
	private AccountTransactionRepository accountTransactionRepository;
	@Autowired
	private CustomerRepository customerRepository;
	@Autowired
	private TrannsactionLogRepository trannsactionLogRepository;

	@Override
	public void blockAccount(Long accountNumber) {

	}

	@Override
	public void deposit(Long accountNumber, double amount, String name) {
		Account account = accountRepository.findById(accountNumber).orElseThrow(AccountNotfoundEx::new);
		account.setBalance(account.getBalance() + amount);
		AccountTransaction accountTransaction = new AccountTransaction("deposit", amount);
		account.addTransaction(accountTransaction);
		accountRepository.save(account);
		TransactionLog log = new TransactionLog(accountNumber, null, "deposit", amount, name, "done");
		trannsactionLogRepository.save(log);

	}

	@Override
	public void withdraw(Long accountNumber, double amount) {
		Account account = accountRepository.findById(accountNumber).orElseThrow(AccountNotfoundEx::new);
		account.setBalance(account.getBalance() - amount);
		AccountTransaction accountTransaction = new AccountTransaction("withraw", amount);
		account.addTransaction(accountTransaction);
		accountRepository.save(account);
		TransactionLog log = new TransactionLog(null, accountNumber, "withraw", amount, "guru", "done");
		trannsactionLogRepository.save(log);

	}

	@Override
	public Account transfer(Long fromAccNumber, Long toAccNumber, double amount) {
		Account account = accountRepository.findById(fromAccNumber).orElseThrow(AccountNotfoundEx::new);
		account.setBalance(account.getBalance() - amount);
		AccountTransaction accountTransaction = new AccountTransaction("withraw", amount);
		account.addTransaction(accountTransaction);
		accountRepository.save(account);
		Account account1 = accountRepository.findById(toAccNumber).orElseThrow(AccountNotfoundEx::new);
		account1.setBalance(account1.getBalance() + amount);
		AccountTransaction accountTransaction1 = new AccountTransaction("deposit", amount);
		account1.addTransaction(accountTransaction1);
		accountRepository.save(account1);
		TransactionLog log1 = new TransactionLog(fromAccNumber, toAccNumber, "transfer", amount, "guru", "done");
		trannsactionLogRepository.save(log1);
		return account;

	}

	@Override
	public List<AccountTransaction> cheackAllTransactionByAccountNumber(long accountNumber) {

		Account account = accountRepository.findById(accountNumber).orElseThrow(AccountNotfoundEx::new);
		List<AccountTransaction> accountTransactions = account.getTransactionList();

		return accountTransactions;

	}

	@Override
	public Account UpdateAccount(Long AccountNumber, com.bankapp.model.formbean.UpdateAccount req) {
		Account account = accountRepository.findById(AccountNumber).orElseThrow(AccountNotfoundEx::new);
		account.getCustomer().setName(req.getName());
		account.getCustomer().setEmail(req.getEmail());
		account.getCustomer().setPhone(req.getPhone());
		account.getCustomer().setAddress(req.getAddress());
		accountRepository.save(account);

		return account;
	}

	@Override
	public void deleteAccount(Long accountNumber) {
		Account account = accountRepository.findById(accountNumber).orElseThrow(AccountNotfoundEx::new);
		accountRepository.delete(account);

	}

	@Override
	public Account createAccount(Account account) {
		accountRepository.save(account);
		customerRepository.save(account.getCustomer());
		return account;
	}

	@Override
	public List<Account> getAllAccounter() {

		return accountRepository.findAll();
	}

}
