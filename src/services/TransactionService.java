package services;

import dao.AccountDAO;
import digester.Account;
import digester.Transaction;

public class TransactionService {
	
	public static Account executerTransaction(Transaction transaction){
		Account account = AccountDAO.getAccountByCustomerID(transaction.getCustomerId());
		if(transaction.getType()=="debit"){
			return debiterCompte(account,transaction.getAmount());
		}
		if(transaction.getType()=="credit"){
			return crediterCompte(account,transaction.getAmount());
		}
		return account;
		
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
