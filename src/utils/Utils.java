package utils;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;

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
		 return new MongoClient(MONGO_URI).getDatabase("tnsi");
		
	}

}
