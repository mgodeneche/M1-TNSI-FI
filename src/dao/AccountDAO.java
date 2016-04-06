package dao;

import com.mongodb.DBCollection;
import com.mongodb.client.MongoDatabase;

import digester.Account;
import dto.AccountDTO;
import utils.Utils;

public class AccountDAO {

	public static void accountPersist(AccountDTO accountDTO){
		MongoDatabase db = Utils.getDbConnect();
	    
	    
	    DBCollection accountDataCollection = null ;
	    accountDataCollection = (DBCollection) db.getCollection(AccountDTO.COLLECTION_NAME);

	    accountDataCollection.save(accountDTO);

	    System.err.println(accountDataCollection.findOne());
	}
	public static Account getAccountByCustomerID(long customerId){
		//executer un findOne
		return null;
	}

}
