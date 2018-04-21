package com.akshay.aopdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class AccountDAO {

	public void addAccount() {
		System.out.println(getClass()+"\t Is Working");
	}
	
	public void addAdmin() {
		System.out.println(getClass()+"\t add Admin  Is Working");
	}
}
