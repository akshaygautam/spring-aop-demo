package com.akshay.aopdemo;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.akshay.aopdemo.dao.Account;
import com.akshay.aopdemo.dao.AccountDAO;

public class AfterReturningMainDemoApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(DemoConfig.class);
		
		AccountDAO accountDAO = context.getBean(AccountDAO.class);		
		List<Account> accounts = accountDAO.findAccount();
		System.out.println("Main prog After returning:\t"+accounts);
		context.close();
	}

}
