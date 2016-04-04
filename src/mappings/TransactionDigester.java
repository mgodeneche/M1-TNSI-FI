package mappings;
import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import digester.Transaction;



public class TransactionDigester {

	  public Transaction digest(File xmlFile) {
		  try {
				JAXBContext jaxbContext = JAXBContext.newInstance(Transaction.class);
	
				Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
				Transaction transaction = (Transaction) jaxbUnmarshaller.unmarshal(xmlFile);
				
				return transaction;
			  } catch (JAXBException e) {
				e.printStackTrace();
			  }
		return null;
		  
	  
	}
}
