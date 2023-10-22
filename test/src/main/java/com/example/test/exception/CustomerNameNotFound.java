package com.example.test.exception;


public class CustomerNameNotFound extends RuntimeException{
	
	public CustomerNameNotFound(String string)

	{

		super(string);

	}
}