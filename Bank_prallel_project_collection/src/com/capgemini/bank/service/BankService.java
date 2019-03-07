package com.capgemini.bank.service;

import java.math.BigDecimal;

import com.capgemini.bank.bean.Customer;

public interface BankService {
	public Customer createAccount(String name,String mobileNo,BigDecimal amount);
	public Customer showBalance(String mobileNo);
	public Customer fundTransfer(String sourceMobileNo,String targetMobileNo,BigDecimal amount);
	public Customer depositAmount(String mobileNo,BigDecimal amount);
	public Customer withdrawAmount(String mobileNo,BigDecimal amount);

}
