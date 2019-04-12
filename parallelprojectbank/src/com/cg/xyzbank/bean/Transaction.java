package com.cg.xyzbank.bean;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="transaction")
public class Transaction
{
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int transactionid;
private int accno;
private String transactiontype;
private double transactionamount;
private Date transactiondate;
private String transactiontime;
public int getTransactionid() {
	return transactionid;
}
public void setTransactionid(int transactionid) {
	this.transactionid = transactionid;
}
public int getAccno() {
	return accno;
}
public void setAccno(int accno) {
	this.accno = accno;
}
public String getTransactiontype() {
	return transactiontype;
}
public void setTransactiontype(String transactiontype) {
	this.transactiontype = transactiontype;
}

public double getTransactionamount() {
	return transactionamount;
}
public void setTransactionamount(double transactionamount) {
	this.transactionamount = transactionamount;
}
public Date getTransactiondate() {
	return transactiondate;
}
public void setTransactiondate(Date transactiondate) {
	this.transactiondate = transactiondate;
}
public String getTransactiontime() {
	return transactiontime;
}
public void setTransactiontime(String transactiontime) {
	this.transactiontime = transactiontime;
}
@Override
public String toString() {
	return "Transaction [transactionid=" + transactionid + ", accno=" + accno + ", transactiontype=" + transactiontype
			+ ", transactionamount=" + transactionamount + ", transactiondate=" + transactiondate + ", transactiontime="
			+ transactiontime + "]";
}

}
