package dao;


import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Key;


import digester.Customer;
import utils.Utils;

public class AccountDAO {

	public static Key<Customer> accountPersist(Customer customer){
		Datastore ds = Utils.getDb();
		return ds.save(customer);

	}
	public static Customer getAccountByCustomerId(long customerId){
		Datastore ds = Utils.getDb();
		Customer customer = (Customer) ds.find(Customer.class, "customerId = ", customerId);
		return customer;
	}
	

}
