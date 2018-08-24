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
		Accounts john3 = new Accounts("John", "Macles","125");
		Accounts john4 = new Accounts("John", "Seb","126");
		
		AccountServices service = new AccountServices();
		
		Integer instances = service.countFirstName("John");
		
		assertEquals(4, instances);
	}
}
