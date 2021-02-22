package com.hcl.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.hcl.model.BankAccount;
import com.hcl.service.BankService;

@Controller
public class BankController {
	private BankService bankService;
	@Autowired(required=true)
	public void setUserService(BankService bankService) {
		this.bankService=bankService;
	}
	@RequestMapping("/index")
	public ModelAndView loginpage() {
		ModelAndView model=new ModelAndView();
		model.setViewName("login");
		return model;
	}
	@RequestMapping(value="/login",method= {RequestMethod.POST,RequestMethod.GET})
	public String loginUser(@Valid @ModelAttribute("bankAccount") BankAccount bankAccount,BindingResult result) {
    System.out.println("The user name is: " +bankAccount.getName());
    boolean checkBank=bankService.bank(bankAccount.getName());
    if(checkBank==true) {
    	System.out.println("Correct Login credentials,redirected to welcome page");
    	String name=bankAccount.getName();
    	return "redirect:/bankList";
    }
    else {
    	System.out.println("Incorrect Banker");
    	
    	return "redirect:/login";
    	
    }
    
    }
}
