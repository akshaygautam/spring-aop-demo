package com.akshay.aopdemo.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class AccountDAO {
	
	private String name;
	private String serviceCode;
	
	public List<Account> findAccount(boolean tripWire) throws Exception{
		if(tripWire) throw new RuntimeException("No accounts");
		List<Account>	myAccounts = new ArrayList<>();
		myAccounts.add(new Account(5,"aks","gau"));
		myAccounts.add(new Account(6,"raj","rel"));
		myAccounts.add(new Account(7,"har","bha"));
		return myAccounts;
	}
	public void addAccount() {
		System.out.println(getClass()+"\t Is Working");
	}
	
	public void addAdmin() {
		System.out.println(getClass()+"\t add Admin  Is Working");
	}
}
