package com.hcl.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.dao.TransactionDao;
import com.hcl.model.BankAccount;

@Service
public class TransactionServiceImpl implements TransactionService {
	TransactionDao transactionDao;
	@Autowired(required=true)
	public void setTransactionDao(TransactionDao transactionDao) {
		this.transactionDao=transactionDao;
	}
	@Transactional
	public List<BankAccount> bankList(){
		return transactionDao.bankList();
	}

}
