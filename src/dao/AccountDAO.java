package dao;

import org.bson.Document;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;

import dto.AccountDTO;
import utils.Utils;

public class AccountDAO {

	public static FindIterable<Document> accountPersist(AccountDTO accountDTO){
		MongoCollection<Document> accountDataCollection = Utils.getDbCollection();
		GsonBuilder gson = new GsonBuilder();
	    gson.enableComplexMapKeySerialization();
		String data = gson.create().toJson(accountDTO);
	    accountDataCollection.insertOne(new Document("account",data));

	   return accountDataCollection.find();
	}
	
	public static AccountDTO getAccountByCustomerID(long customerId){
		MongoCollection<Document> accountDataCollection = Utils.getDbCollection();
	
        DBObject query = new BasicDBObject("customerId", customerId);
		return null;
 
        // resultant document fetched by satisfying the criteria
       // DBObject accountDataDBObject = accountDataCollection.find(query);
        //return (AccountDTO) accountDataDBObject;
        
	}
	

}
