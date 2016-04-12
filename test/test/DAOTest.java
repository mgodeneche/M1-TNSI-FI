package test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;

import dao.AccountDAO;
import digester.Account;
import digester.Customer;


public class DAOTest {
	Customer customer;
	Account account;
	private static String MONGO_URI = "mongodb://tnsi:tnsi@ds013330.mlab.com:13330";
	private static String DATABASE_NAME ="tnsi-fi";
	Datastore ds;
	
	@Before
	public void initialize(){
		account = new Account("FRkk BBBB BGGG GGCC CCCC CCCC CKK", 0, "euro");
		customer = new Customer("XXXXXX", "YYYYYYY", 3, account);
		MongoClientURI mongoClientURI = new MongoClientURI(MONGO_URI);
		MongoClient mongoClient = new MongoClient(mongoClientURI);
		ds = new Morphia().createDatastore(mongoClient,DATABASE_NAME); 
	}

	@Test
	public void insertionTest(){
		Assert.assertNotNull(AccountDAO.accountPersist(customer));
	}

}
