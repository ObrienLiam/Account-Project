package com.qa.system.accountservices;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONObject;

import com.qa.system.accounts.Accounts;

public class AccountServices {

	private Map<Integer, Accounts> accountMap;
	JSONObject gson;
	
	private Integer counter = 1;
	
	public AccountServices()
	{
		accountMap = new HashMap<>();
		gson = new JSONObject(accountMap);
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
}
