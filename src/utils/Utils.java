package utils;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;

import org.bson.Document;

import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import dto.AccountDTO;

public abstract class Utils {

	private static String MONGO_URI = "mongodb://tnsi:tnsi@ds013330.mlab.com:13330/tnsi-fi";

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
	
	@SuppressWarnings("resource")
	public static MongoDatabase getDbConnect(){
		MongoClientURI uri = new MongoClientURI(MONGO_URI);
		 return new MongoClient(uri).getDatabase("tnsi-fi");
		
	}
	public static MongoCollection<Document> getDbCollection() {
		MongoDatabase db = Utils.getDbConnect();
	    MongoCollection<Document> accountDataCollection = null ;
	    accountDataCollection = db.getCollection(AccountDTO.COLLECTION_NAME);
		return accountDataCollection;
	}

}
