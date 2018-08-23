package com.qa.system.accountservices;

import java.util.HashMap;
import java.util.Map;

import com.qa.system.accounts.Accounts;

public class AccountServices {

	private Map<Integer, Accounts> accountMap;
	
	private Integer counter = 1;
	
	public AccountServices()
	{
		accountMap = new HashMap<>();
	}
	
	public void addAccountToMap(Accounts accountToAdd)
	{
		accountMap.put(counter, accountToAdd);
		counter++;
	}
	
	public Accounts getAccountFromMap(Integer accountToGet)
	{
		return accountMap.get(accountToGet);
	}
	
	public Map<Integer, Accounts> returnMap()
	{
		return accountMap;
	}
}
