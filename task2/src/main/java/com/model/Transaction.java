package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.boot.autoconfigure.web.ResourceProperties.Strategy;

@Entity
public class Transaction {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
int id;
public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getBalance_after_transaction() {
		return balance_after_transaction;
	}
	public void setBalance_after_transaction(int balance_after_transaction) {
		this.balance_after_transaction = balance_after_transaction;
	}
int balance,balance_after_transaction;
}
