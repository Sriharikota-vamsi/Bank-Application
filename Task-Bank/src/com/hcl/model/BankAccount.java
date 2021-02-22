package com.hcl.model;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Id;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;



@Entity
@Table(name="BANKACCOUNT")
public class BankAccount {
	@Id
	@Column(name="CARD_NUMBER")
	private int cardNumber;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="AGE")
	private int age;
	
	@Column(name="GENDER")
	private String gender;
	
	@Column(name="BANK")
	private String bank;
	
	@Column(name="CARD_LIMIT")
	private int cardLimit;
	@ManyToOne
	@JoinColumn(name="Card_Number")
	private BankTransaction bankTransaction;
	
	public BankAccount() {
		
	}

	public int getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(int cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBank() {
		return bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

	public int getCardLimit() {
		return cardLimit;
	}

	public void setCardLimit(int cardLimit) {
		this.cardLimit = cardLimit;
	}

	public BankTransaction getBankTransaction() {
		return bankTransaction;
	}

	public void setBankTransaction(BankTransaction bankTransaction) {
		this.bankTransaction = bankTransaction;
	}
	
	
	
	
	
	

}
