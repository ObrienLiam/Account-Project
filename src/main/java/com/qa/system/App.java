package com.qa.system;

import com.qa.system.accounts.Accounts;
import com.qa.system.accountservices.AccountServices;
import com.qa.system.JSON.ConvertToJSON;

public class App {

	public static void main(String[] args) {
		
		Accounts john = new Accounts("John","Surname","123");
		Accounts peter = new Accounts("Peter","Manson","124");
		Accounts mary = new Accounts("Mary","Betty","125");
		
		AccountServices service = new AccountServices();
		
		service.addAccountToMap(john);	
		service.addAccountToMap(peter);
		service.addAccountToMap(mary);
		
		System.out.println(service.getAccountFromMap(1).toString());
		
		ConvertToJSON gson = new ConvertToJSON(service.returnMap());
		
		System.out.println(service.returnMap().toString());
		System.out.println(gson.getStringJSON());
		                                                                                                                                                                                                                                                                       
	}

}
