package digester;

import java.awt.List;
import java.io.File;
import java.util.ArrayList;

import mappings.TransactionDigester;
import services.TransactionService;

public class Main {

	public static void main(String[] args) {

		File xml = new File("ressources/transaction.xml");
		File json = new File("ressources/transaction.json");

		ArrayList<Transaction> transactionsQueue = new ArrayList<Transaction>();
		transactionsQueue.add(TransactionDigester.digestXML(xml));
		transactionsQueue.add(TransactionDigester.digestJSON(json));
		
		for(Transaction transaction:transactionsQueue){
			TransactionService.executerTransaction(transaction);
		}
				
	}

}
