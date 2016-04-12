package services;

import dao.AccountDAO;
import digester.Account;
import digester.Transaction;

public class TransactionService {
	
	public static Account executerTransaction(Transaction transaction){
	
		return null;
		
	}
	
	public static Account debiterCompte(Account account,float amount) {
		account.setBalance(account.getBalance()-amount);
		return account;
	}
	
	public static Account crediterCompte(Account account,float amount){
		account.setBalance(account.getBalance()+amount);
		return account;
	}
}
