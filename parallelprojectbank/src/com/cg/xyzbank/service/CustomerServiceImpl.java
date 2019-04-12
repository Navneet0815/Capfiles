package com.cg.xyzbank.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.xyzbank.bean.Customer;
import com.cg.xyzbank.bean.Transaction;
import com.cg.xyzbank.dao.CustomerDaoImpl;
import com.cg.xyzbank.dao.ICustomerDao;
import com.cg.xyzbank.exception.BankException;

@Service
@Transactional
public class CustomerServiceImpl implements ICustomerService {
	
	@Autowired
	ICustomerDao objDao=new CustomerDaoImpl();

	public ICustomerDao getObjDao() {
		return objDao;
	}

	public void setObjDao(ICustomerDao objDao) {
		this.objDao = objDao;
	}
	
	public int addCustomer(Customer customer)
	{
		
		return objDao.addCustomer(customer);
	}

	@Override
	public Transaction depositMoney(int id, double amt) throws BankException {
		// TODO Auto-generated method stub
		
		return objDao.depositMoney(id,amt);
	}

	@Override
	public Transaction withdrawMoney(int id, double amt)throws BankException {
		// TODO Auto-generated method stub
		return objDao.withdrawMoney(id,amt);
	}

	@Override
	public Transaction fundTransfer(int id, int id2, double amt)throws BankException {
		// TODO Auto-generated method stub
		return objDao.fundTransfer(id,id2, amt);
	}



	@Override
	public Customer showBalance(int id) {
		// TODO Auto-generated method stub
		return objDao.showBalance(id);
	}

	

	@Override
	public List<Transaction> getAllTransactionDetails(int accno) {
		// TODO Auto-generated method stub
		return objDao.getAllTransactionDetails(accno);
	}

}
