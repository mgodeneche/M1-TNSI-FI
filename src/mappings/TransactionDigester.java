package mappings;
import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.google.gson.Gson;

import digester.Transaction;
import utils.Utils;



public abstract class TransactionDigester {

	  public static Transaction digestXML(File xmlFile) {
		  try {
				JAXBContext jaxbContext = JAXBContext.newInstance(Transaction.class);
	
				Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
				Transaction transaction = (Transaction) jaxbUnmarshaller.unmarshal(xmlFile);
				System.out.println(transaction.toString());
				return transaction;
			  } catch (JAXBException e) {
				e.printStackTrace();
			  }
		return null;
		  
	  
	}
	  public static Transaction digestJSON(File jsonFile){
		  String jsonData = Utils.readFile(jsonFile);
		  Transaction transaction = new Gson().fromJson(jsonData, Transaction.class);
		  System.out.println(transaction.toString());
		  return transaction;
	  }
	  
}
