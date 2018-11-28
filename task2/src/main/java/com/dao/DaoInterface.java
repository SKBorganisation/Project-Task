package com.dao;

import org.springframework.data.repository.CrudRepository;

import com.model.Transaction;

public interface DaoInterface extends CrudRepository<Transaction, Integer>{
int findBalanceByName(String uname);
}
