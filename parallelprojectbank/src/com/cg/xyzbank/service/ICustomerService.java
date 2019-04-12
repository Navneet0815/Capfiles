package com.cg.xyzbank.service;

import java.util.List;

import com.cg.xyzbank.bean.Customer;
import com.cg.xyzbank.bean.Transaction;
import com.cg.xyzbank.exception.BankException;

public interface ICustomerService {
	public int addCustomer(Customer customer);

	public Transaction depositMoney(int id, double amt) throws BankException;

	public Transaction withdrawMoney(int id, double amt)throws BankException;

	public Transaction fundTransfer(int id, int id2, double amt)throws BankException;

	public Customer showBalance(int id);

	List<Transaction> getAllTransactionDetails(int accno);

}
