package com.cg.xyzbank.controller;



import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


import com.cg.xyzbank.bean.Customer;
import com.cg.xyzbank.bean.Transaction;
import com.cg.xyzbank.exception.BankException;
import com.cg.xyzbank.service.ICustomerService;

@Controller
public class CustomerController {

	@Autowired
	private ICustomerService obService;

	public ICustomerService getObService() {
		return obService;
	}

	public void setObService(ICustomerService obService) {
		this.obService = obService;
	}
	
	
	
	
	
@RequestMapping("/showAddCustomer")
	public ModelAndView showAddTrainee()
	{
		Customer customer=new Customer();
		
		return new ModelAndView("AddCustomer","customer",customer);
	}
	
	@RequestMapping("/addCustomer")
	public ModelAndView addTrainee(@ModelAttribute("customer") @Valid Customer customer,
			BindingResult result)
	 {
		ModelAndView mv = null;
		if (!result.hasErrors()) {
			int id=obService.addCustomer(customer);
			mv = new ModelAndView("Success","id",id);
			
			} else {
			mv = new ModelAndView("AddCustomer", "customer", customer);
		}
		return mv;
	 }
	@RequestMapping("/showHome")
	public String showHome()
	{
		return "Home";
		
	}
	@RequestMapping("/showDepositMoney")
	public String showDepositMoney()
	{
		return "DepositMoney";
		
	}
	
	@RequestMapping("/depositMoney")
	
	public ModelAndView depositMoney(@RequestParam("id") int id,
			@RequestParam("amt") double amt,Model m)
	{
		
		try {
			
			
			obService.depositMoney(id,amt);
			
		} catch (BankException e) {
			// TODO Auto-generated catch block
		
			throw new BankException(e.getMessage());
		
		}
		
		return new ModelAndView("Transactionsuccess","id",id);
		
	}
	
	@RequestMapping("/showWithdrawMoney")
	public String WithdrawMoney()
	{
		return "WithdrawMoney";
		
	}
	@RequestMapping("/withdrawMoney")
	public ModelAndView withdrawMoney(@RequestParam("id") int id,
			@RequestParam("amt") double amt,Model m)
	{
		try {
		obService.withdrawMoney(id,amt);
		
		} catch (BankException e) {
			// TODO Auto-generated catch block
		
			throw new BankException(e.getMessage());
		
		}
		return new ModelAndView("Transactionsuccess","id",id);
		
	}
	@RequestMapping("/showFundTransfer")
	public String showFundTransfer()
	{
		return "FundTransfer";
		
	}
	@RequestMapping("/fundTransfer")
	public ModelAndView fundTransfer(@RequestParam("id") int id,@RequestParam("id2") int id2,
			@RequestParam("amt") double amt,Model m)
	{
		try {
		obService.fundTransfer(id,id2,amt);
		} catch (BankException e) {
			// TODO Auto-generated catch block
		
			throw new BankException(e.getMessage());
		
		}
		return new ModelAndView("Transactionsuccess","id",id);
		
	}

	@RequestMapping("/showBalance")
	public String showShowBalance()
	{
		return "ShowBalanceForm";
		
	}
	@RequestMapping("/Balance")
	public ModelAndView showBalance(@RequestParam("id") int id,Model m) {

		ModelAndView mv =new ModelAndView();
		
		Customer customer=obService.showBalance(id);
		
		    System.out.println(customer);
		 	System.out.println("1");
			mv.setViewName("ShowingBalance");
			System.out.println("2");
			// Add the attribute to the model
			mv.addObject("balance",customer.getBalance());
			System.out.println("3");
			
		return mv;
	}
	
	@RequestMapping("/showTransaction")
	public ModelAndView showTransaction()
	{
		Customer customer=new Customer();
		
		return new ModelAndView("ShowTransactionForm","customer",customer);
	}
	@RequestMapping("/Transaction")
	public ModelAndView showTran(@RequestParam("id") int id,Model m)
	{
		
       ModelAndView mv =new ModelAndView();
		List<Transaction> list = obService.getAllTransactionDetails(id);
       if(list.isEmpty())
       {
		mv.setViewName("TransactionPage");
		mv.addObject("nulllist", "No transaction Found");
		mv.addObject("list", list);
       }
       else  if(list!=null)
       {
		mv.setViewName("TransactionPage");
		
		mv.addObject("list", list);
       }
		
	return mv;

			
	
		
		
	

	
	
}
}
