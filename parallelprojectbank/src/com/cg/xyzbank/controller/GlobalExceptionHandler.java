package com.cg.xyzbank.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;


import com.cg.xyzbank.exception.BankException;


@ControllerAdvice
public class GlobalExceptionHandler

{
	
	
	@ExceptionHandler(value = {BankException.class})
    protected ModelAndView handleConflict(Exception ex) {
		ModelAndView model = new ModelAndView("error");
		model.addObject("errMsg", ex.getMessage());
		return model;
}
}
