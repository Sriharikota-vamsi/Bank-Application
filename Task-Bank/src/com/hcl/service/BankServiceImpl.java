package com.hcl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.dao.BankDao;

@Service
public class BankServiceImpl implements BankService {
	private BankDao bankDao;
	@Autowired(required=true)
	public void setUserDao(BankDao bankerDao) {
		this.bankDao=bankerDao;
	}
	public boolean bank(String name) {
		System.out.println("In Service class..Check");
		return bankDao.bank(name);
	}

}
