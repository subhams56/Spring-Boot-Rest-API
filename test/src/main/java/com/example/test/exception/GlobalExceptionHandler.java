package com.example.test.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler (CustomerIdNotFound.class)
	public String handlingException(CustomerIdNotFound ce) {
		return  ce.getMessage();
		
	}
	@ExceptionHandler (ItemIdNotFound.class)
	public String handlingException(ItemIdNotFound ce) {
		return  ce.getMessage();
		
	}
	
	@ExceptionHandler (CustomerNameNotFound.class)
	public String handlingException(CustomerNameNotFound ce) {
		return  ce.getMessage();
		
	}
	
	@ExceptionHandler (OrderIdNotFound.class)
	public String handlingException(OrderIdNotFound ce) {
		return  ce.getMessage();
		
	}
	
	@ExceptionHandler (BillIdNotFound.class)
	public String handlingException(BillIdNotFound ce) {
		return  ce.getMessage();
		
	}
	@ExceptionHandler (AdminIdNotFound.class)
	public String handlingException(AdminIdNotFound ce) {
		return  ce.getMessage();
		
	}
	@ExceptionHandler (AdminNameNotFound.class)
	public String handlingException(AdminNameNotFound ce) {
		return  ce.getMessage();
		
	}

}
