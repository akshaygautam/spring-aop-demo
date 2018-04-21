package com.akshay.aopdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {
	public void addAccount() {
		System.out.println(getClass()+"\t Is Working");
	}
	
	public String addAccounts(String a) {
		return a+"\takshay";
	}
	
}
