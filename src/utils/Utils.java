package utils;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;

import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;

import digester.Account;
import digester.Customer;


public abstract class Utils {

	private static String MONGO_URI = "mongodb://tnsi:tnsi@ds013330.mlab.com:13330/tnsi-fi";
	private static String DATABASE_NAME ="tnsi-fi";

	public static String readFile(File file){
	   
		try{
		    DataInputStream dis = 
			    new DataInputStream (
			    	 new FileInputStream (file));
			       
			 byte[] datainBytes = new byte[dis.available()];
			 dis.readFully(datainBytes);
			 dis.close();
			       
			 String content = new String(datainBytes, 0, datainBytes.length);
			 return content;
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}
	

	public static Datastore getDb(){
		Morphia morphia = new Morphia();
		morphia.map(Customer.class).map(Account.class);
		MongoClientURI mongoClientURI = new MongoClientURI(MONGO_URI);
		MongoClient mongoClient = new MongoClient(mongoClientURI);
		Datastore ds = morphia.createDatastore(mongoClient, DATABASE_NAME);
		return ds;
	}
	


	
}
