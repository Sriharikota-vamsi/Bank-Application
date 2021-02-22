package com.hcl.dao;

import java.util.List;
import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hcl.model.BankAccount;

@Repository
public class TransactionDaoImpl implements TransactionDao {
	
private SessionFactory sessionFactory;
	
	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory=sessionFactory;
	}
	@Override
	@SuppressWarnings("Unchecked")
	public List<BankAccount> bankList(){
		return sessionFactory.getCurrentSession().createQuery("from BankAccount t where t.card_number = :tcard_number ")
				.setParameter("t.transaction_date",2).setParameter("t.amount", 2).list();
	}

}
