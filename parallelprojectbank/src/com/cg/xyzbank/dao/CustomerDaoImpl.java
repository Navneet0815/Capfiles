package com.cg.xyzbank.dao;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;


import com.cg.xyzbank.bean.Customer;
import com.cg.xyzbank.bean.Transaction;
import com.cg.xyzbank.exception.BankException;

@Repository
public class CustomerDaoImpl implements ICustomerDao {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public int addCustomer(Customer customer) {
		// TODO Auto-generated method stub
	

		entityManager.persist(customer);
	    entityManager.flush();
		 return customer.getId();
	
	}

	@Override
	public Transaction depositMoney(int id, double amt) throws BankException{
		// TODO Auto-generated method stub
		  Transaction tran=new Transaction();

		Customer customer=entityManager.find(Customer.class,id);
		if(customer!=null)
		{
			
	    customer.setBalance(amt+customer.getBalance());
	   
	    entityManager.merge(customer);
	   
	    
	  
	    tran.setAccno(customer.getId());
	    tran.setTransactionamount(amt);
	    tran.setTransactiontype("credit");
	    tran.setTransactiondate(Date.valueOf(LocalDate.now()));
	    String t=LocalTime.now()+"";
	    tran.setTransactiontime(t);
	    entityManager.persist(tran);
		
		}
		else
		{
			throw new BankException("invalid id");
		}
		
		return tran;
	
	}

	@Override
	public Transaction withdrawMoney(int id, double amt) {
		// TODO Auto-generated method stub
		 Transaction tran1=new Transaction();
		Customer customer=entityManager.find(Customer.class,id);
		
		if(customer!=null)
		{
		double bal=customer.getBalance()-amt;
		if(bal>=0)
			customer.setBalance(bal);
		    entityManager.merge(customer);
		    
		   
		    tran1.setAccno(customer.getId());
		    tran1.setTransactionamount(amt);
		    tran1.setTransactiontype("debit");
		    tran1.setTransactiondate(Date.valueOf(LocalDate.now()));
		    String t=LocalTime.now()+"";
		    tran1.setTransactiontime(t); 
		    entityManager.persist(tran1);
		}
		else
		{
			throw new BankException("INVALID ACCOUNT NUMBER");
		}
		    return tran1;
	}

	@Override
	public Transaction fundTransfer(int id, int id2, double amt) {
		// TODO Auto-generated method stub
		Customer customer=entityManager.find(Customer.class,id);
		Customer customer2=entityManager.find(Customer.class,id2);
		 Transaction tran=new Transaction();
		 Transaction tran1=new Transaction();
		if(customer!=null)
		{
		double bal=customer.getBalance()-amt;
		if(bal>=0)
		{
			customer.setBalance(bal);
			customer2.setBalance(customer2.getBalance()+amt);
		}
		entityManager.merge(customer);
		entityManager.merge(customer2);
		
		
		    tran.setAccno(customer.getId());
		    tran1.setAccno(customer2.getId());
		    tran.setTransactionamount(amt);
		    tran1.setTransactionamount(amt);
		    tran.setTransactiontype("fundtransfrred");
		    tran1.setTransactiontype("fundrecieved");
		    tran.setTransactiondate(Date.valueOf(LocalDate.now()));
		    tran1.setTransactiondate(Date.valueOf(LocalDate.now()));
		    String t=LocalTime.now()+"";
		    tran.setTransactiontime(t); 
		    tran1.setTransactiontime(t); 
		    entityManager.persist(tran);
		   
		    entityManager.persist(tran1);
		}
		    else
			{
				throw new BankException("INVALID ACCOUNT NUMBER");
			}
			    return tran1;
		
		   
			  
		    
			}



	@Override
	public Customer showBalance(int id) {
		// TODO Auto-generated method stub
		TypedQuery<Customer> query = entityManager.createQuery("SELECT customer FROM Customer customer where customer.id=:pid", Customer.class);
		query.setParameter("pid", id);
		
		return query.getSingleResult();
	}

	@Override
	public List<Transaction> getAllTransactionDetails(int accno) {
		// TODO Auto-generated method stub
		TypedQuery<Transaction> query = entityManager.createQuery("SELECT tran FROM Transaction tran where tran.accno=:tid", Transaction.class);
		query.setParameter("tid",accno);
		return query.getResultList();
		
		
		
		
	
	}
	
	
	
	

}
