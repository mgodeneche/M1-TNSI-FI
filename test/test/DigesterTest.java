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
		transaction = TransactionDigester.digestXML(xml);
	   }
	
	@Test
	public void transactionIdNotNull(){
		Assert.assertNotNull(transaction.getTransactionId());
	}
	
	@Test
	public void transactionIdIsSet(){
		Assert.assertTrue(transaction.getTransactionId()!=0);
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
	public void typeIsSet(){
		Assert.assertTrue(transaction.getType().length()!=0);
	}
	
	@Test
	public void amountNotNull(){
		Assert.assertNotNull(transaction.getAmount());
	}
	@Test
	public void amountIsSet(){
		Assert.assertTrue(transaction.getAmount()!=0);
	}
	
	@Test
	public void currencyNotNull(){
		Assert.assertNotNull(transaction.getCurrency());
	}
	@Test
	public void currencyIsSet(){
		Assert.assertTrue(transaction.getCurrency().length()!=0);
	}
	
	@Test
	public void customerIdNotNull(){
		Assert.assertNotNull(transaction.getCustomerId());
	}
	@Test
	public void customerIdIsSet(){
		Assert.assertTrue(transaction.getCustomerId()!=0);
	}
	

	
}
