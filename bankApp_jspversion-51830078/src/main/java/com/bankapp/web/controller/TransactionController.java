package com.bankapp.web.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bankapp.model.formbean.AccountTransferForm;
import com.bankapp.model.formbean.Depositform;
import com.bankapp.model.repository.AccountRepository;
import com.bankapp.model.service.AccountService;

@Controller
public class TransactionController {
	@Autowired
	private AccountRepository accountrepository;
	@Autowired
	private AccountService accountService;

	@GetMapping(path = "/clerk")
	public ModelAndView usermanagement(ModelAndView mv) {
		mv.setViewName("clerk");
		return mv;

	}

	@GetMapping(path = "/deposit")
	public String depositGet(ModelMap mm) {
		mm.addAttribute("deposit", new Depositform());
		return "deposit";

	}
	@PostMapping(path="/deposit")
	public String depositPost(Depositform form,Principal principal) {
		accountService.deposit(form.getAccountnumber(), form.getAmount(),
				principal.getName());
		
		return "redirect:clerk";

	}
	@GetMapping(path = "/debit")
	public String debitGet(ModelMap mm) {
		mm.addAttribute("deposit", new Depositform());
		return "debit";

	}
	@PostMapping(path = "/debit")
	public String debitPost(Depositform form,Principal principal) {
		accountService.withdraw(form.getAccountnumber(),form.getAmount());
		return "redirect:clerk";

	}
	@GetMapping(path ="/transfer")
	public String transferGet(ModelMap mm) {
		mm.addAttribute("transfer",new AccountTransferForm());
		return "transfer";

	}
	@PostMapping(path = "/transfer")
	public String transferPost(AccountTransferForm form) {
		accountService.transfer(form.getFromAcc(),form.getToAcc(),form.getAmount());
		return "redirect:clerk";

	}

}
