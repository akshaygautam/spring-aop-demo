package com.akshay.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.akshay.aopdemo.dao.Account;
import com.akshay.aopdemo.dao.AccountDAO;
import com.akshay.aopdemo.dao.MembershipDAO;

public class MainDemoApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(DemoConfig.class);
		
		AccountDAO accountDAO = context.getBean(AccountDAO.class);
		MembershipDAO membershipDAO = context.getBean(MembershipDAO.class);
		accountDAO.addAccount();
		System.out.println("\nMembership------>\n");
		membershipDAO.addAccount();
		System.out.println("\nAdd Admin------>\n");
		accountDAO.addAdmin();
		
		//Not working with overloaded methods
		System.out.println("\nMembership String method------>\n"+membershipDAO.addAccounts("HeyBuddy"));
		
		System.out.println("******************Getter setter and others********************");
		Account acc = new Account();
		System.out.println("No param constructor"+acc);
		Account acc2 = new Account(4,"akshay","4214");
		System.out.println("Param constructor\t"+acc2+"\n\n");
		
		acc.setName("rajat");
		System.out.println("Setting name");
		System.out.println("Getting name \t"+acc.getName() );
		
		System.out.println(acc.toString());
		
		
		context.close();
	}

}
