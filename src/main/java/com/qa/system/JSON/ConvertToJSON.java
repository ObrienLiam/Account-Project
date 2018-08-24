package com.qa.system.JSON;

import java.util.Map;

import org.json.JSONObject;

import com.qa.system.accounts.Accounts;

public class ConvertToJSON {

	private JSONObject gson;
	
	public ConvertToJSON(Map<Integer, Accounts> accountMap)
	{
		gson = new JSONObject(accountMap);
	}
	
	public String getStringJSON()
	{
		return gson.toString();
	}
	
	public JSONObject getJSON()
	{
		return gson;
	}
	
}
