package com.qa.testing;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


import com.qa.system.accounts.Accounts;
import com.qa.system.accountservices.AccountServices;

public class JUnitTesting {

	@Test
	public void countName()
	{
		Accounts john1 = new Accounts("John", "Peters","123");
		Accounts john2 = new Accounts("John", "Samuels","124");
		Accounts mabel = new Accounts("Mabel", "Samuel","134");
		Accounts john3 = new Accounts("John", "Macles","125");
		Accounts john4 = new Accounts("John", "Seb","126");
		
		AccountServices service = new AccountServices();
		
		
		service.addAccountToMap(john1);
		service.addAccountToMap(john2);
		service.addAccountToMap(mabel);
		service.addAccountToMap(john3);
		service.addAccountToMap(john4);	
		
		int instances = service.countFirstName("John");
		
		assertEquals(4, instances);
	}
}
