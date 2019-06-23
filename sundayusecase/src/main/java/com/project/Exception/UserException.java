package com.project.Exception;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.project.entity.BankDetails;

public class UserException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
   @Autowired
	BankDetails bankDetails;
	
	
	public UserException() {
		super();
	}
	
	public String accountExceedsException() 
	{
		
		return null;
	}

}
