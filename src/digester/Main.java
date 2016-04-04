package digester;

import java.io.File;

import mappings.TransactionDigester;

public class Main {

	public static void main(String[] args) {
		File xml = new File("ressources/transaction.xml");
		TransactionDigester transactionDigester = new TransactionDigester();
		transactionDigester.digest(xml);

	}

}
