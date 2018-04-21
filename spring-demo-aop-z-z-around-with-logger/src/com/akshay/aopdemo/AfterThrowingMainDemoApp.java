package com.akshay.aopdemo;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.akshay.aopdemo.dao.Account;
import com.akshay.aopdemo.dao.AccountDAO;

public class AfterThrowingMainDemoApp {

	public static void main(String[] args) throws Exception {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(DemoConfig.class);
		
		AccountDAO accountDAO = context.getBean(AccountDAO.class);		
		List<Account> accounts = accountDAO.findAccount(false);
		System.out.println("Main prog After returning:\t"+accounts);
		context.close();
	}

}
