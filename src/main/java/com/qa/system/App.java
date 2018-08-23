package com.qa.system;

import com.qa.system.accounts.Accounts;
import com.qa.system.accountservices.AccountServices;

public class App {

	public static void main(String[] args) {
		
		Accounts john = new Accounts("John","Surname","123");
		AccountServices service = new AccountServices();
		
		service.addAccountToMap(john);
		
		
	}

}
