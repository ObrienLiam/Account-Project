package com.qa.system;

import com.qa.system.accounts.Accounts;
import com.qa.system.accountservices.AccountServices;

public class App {

	public static void main(String[] args) {
		
		Accounts john = new Accounts("John","Surname","123");
		Accounts peter = new Accounts("Peter","Manson","124");
		AccountServices service = new AccountServices();
		
		System.out.println(john.toString());
		System.out.println(peter.toString());
		
		service.addAccountToMap(john);	
		service.addAccountToMap(peter);
		
		System.out.println(service.getAccountFromMap(1).toString());
		
		                                                                                                                                                                                                                                                                       
	}

}
