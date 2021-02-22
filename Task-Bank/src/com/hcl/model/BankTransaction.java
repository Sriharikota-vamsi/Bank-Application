package com.hcl.model;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="BANKTRANSACTION")
public class BankTransaction {
	@Id
	@Column(name="CARD_NUMBER")
	private int cardNumber;
	@Column(name="TRANSACTION_DATE")
	private String transactionDate;
	@Column(name="AMOUNT")
	private String amount;
	
	@OneToMany
	@JoinColumn(name="Card_Number")
	private List<BankAccount> bankDetails;
	
	public BankTransaction() {
		
	}

	public int getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(int cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public List<BankAccount> getBankDetails() {
		return bankDetails;
	}

	public void setBankDetails(List<BankAccount> bankDetails) {
		this.bankDetails = bankDetails;
	}
	

}
