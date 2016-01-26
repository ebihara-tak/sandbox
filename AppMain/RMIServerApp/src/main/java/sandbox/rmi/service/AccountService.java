package sandbox.rmi.service;

import java.util.HashMap;
import java.util.Map;

import sandbox.rmi.struct.Account;

public class AccountService implements IAccountService {
	
	private final static Map<String, Account> accountMap = new HashMap<String, Account>();
	static {
		accountMap.put("test1", new Account("test1", "male"));
		accountMap.put("test2", new Account("test2", "male"));
		accountMap.put("test3", new Account("test3", "female"));
	}
 
	public Account getAccount(String name) {
		System.out.println("return account " + name);
		return accountMap.get(name);
	}
}