package com.hcl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hcl.model.BankTransaction;
import com.hcl.service.BankService;
import com.hcl.service.TransactionService;

@Controller
public class TransactionalController {
	private TransactionService transactionService;
	@Autowired(required=true)
	public void setTransactionService(TransactionService transactionService) {
		this.transactionService=transactionService;
	}
	@RequestMapping("/bankList")
	public ModelAndView bankList() {
		ModelAndView model=new ModelAndView();
		model.addObject("banks",new BankTransaction());
		model.addObject("bankList",transactionService.bankList());
		System.out.println("Banker details are listed");
		model.setViewName("bankList");
		return model;
	}

}
