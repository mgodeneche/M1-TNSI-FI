package test;

import java.io.File;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import digester.Transaction;
import mappings.TransactionDigester;

public class DigesterTest {
	Transaction transaction;

	@Before 
	public void initialize() {
		File xml = new File("ressources/transaction.xml");
		TransactionDigester transactionDigester = new TransactionDigester();
		transaction = transactionDigester.digest(xml);
	   }
	
	@Test
	public void transactionIdNotNull(){
		Assert.assertNotNull(transaction.getTransactionId());
	}
	
	@Test
	public void transactionDateNotNull(){
		Assert.assertNotNull(transaction.getTransactionDate());
	}
	
	@Test
	public void typeNotNull(){
		Assert.assertNotNull(transaction.getType());
	}
	
	@Test
	public void amountNotNull(){
		Assert.assertNotNull(transaction.getAmount());
	}
	
	@Test
	public void currencyNotNull(){
		Assert.assertNotNull(transaction.getCurrency());
	}
	
	@Test
	public void customerIdNotNull(){
		Assert.assertNotNull(transaction.getCustomerId());
	}

	
}
