package test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import dao.AccountDAO;
import digester.Account;
import digester.Customer;
import dto.AccountDTO;
import mappings.AccountDTODigester;

public class DAOTest {
	AccountDTO accountDTO;
	
	@Before
	public void initialize(){
		Account account = new Account("FRkk BBBB BGGG GGCC CCCC CCCC CKK", 0, "euro");
		Customer customer = new Customer("Jean Maurice", "Lhommedieu", 1, account);
		this.accountDTO = new AccountDTO(account, customer);
		System.out.println(accountDTO.toString());
	}
	@Test
	public void toJson(){
		Assert.assertNotNull(AccountDTODigester.digestJSON(accountDTO));
	}
	/*@Test
	public void insertionTest(){
		Assert.assertNotNull(AccountDAO.accountPersist(accountDTO));
	}*/

}
