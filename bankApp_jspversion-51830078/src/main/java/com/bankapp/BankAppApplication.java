package com.bankapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bankapp.model.entities.Account;
import com.bankapp.model.entities.Customer;
import com.bankapp.model.entities.User;
import com.bankapp.model.repository.AccountRepository;
import com.bankapp.model.repository.AccountTransactionRepository;
import com.bankapp.model.repository.CustomerRepository;
import com.bankapp.model.repository.TrannsactionLogRepository;
import com.bankapp.model.repository.UserRepository;
import com.bankapp.model.service.AccountService;

@SpringBootApplication
public class BankAppApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(BankAppApplication.class, args);
	}
	@Autowired
	private AccountRepository accountRepository;
	@Autowired
	private AccountTransactionRepository accountTransactionRepository;
	@Autowired
	private CustomerRepository customerRepository;
	@Autowired
	private TrannsactionLogRepository trannsactionLogRepository;
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private AccountService acccountservice;

	@Override
	public void run(String... args) throws Exception {
		//acccountservice.deposit(2L,1000);
		//acccountservice.withdraw(2L, 1000);
		//acccountservice.transfer(1L, 2L,2000);
		
	/*Customer cust1=new Customer("guru","guru@gmail.com","98430","pasumalai","madurai", "india");
	Customer cust2=new Customer("kishore","kishore@gmail.com","98430","pasumalai","madurai", "india");
	Customer cust3=new Customer("bala","bala@gmail.com","98430","pasumalai","madurai", "india");
	
	Account acc1=new Account(5000.0, cust1,false );
	Account acc2=new Account(3000.0, cust2,false );
	Account acc3=new Account(2000.0, cust3,false );
	cust1.setAccount(acc1);
	cust2.setAccount(acc2);
	cust3.setAccount(acc3);
	accountRepository.save(acc1);
	accountRepository.save(acc2);
	accountRepository.save(acc3);*/
		/*User user1=new User("guru","guru","guru@gmail.com", 
				"878786","pasumalai",new String[]{"ROLE_ADMIN","ROLE_MGR","ROLE_CLERK"}, true);
		User user2=new User("kishour","kishour","kishour@gmail.com", 
				"878786","pasumalai",new String[]{"ROLE_ADMIN","ROLE_MGR"}, true);
		User user3=new User("jayanthi","jayanthi","jayanthi@gmail.com", 
				"878786","pasumalai",new String[]{"ROLE_CLERK"}, true);
		userRepository.save(user1);
		userRepository.save(user2);
		userRepository.save(user3);*/
		
		
		
	}

}
