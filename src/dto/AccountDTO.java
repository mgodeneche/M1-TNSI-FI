package dto;

import java.io.Serializable;

import digester.Account;
import digester.Customer;
import com.mongodb.BasicDBObject;

public class AccountDTO extends BasicDBObject implements Serializable{

	/**
	 * 
	 */
	public static final String COLLECTION_NAME = "account-data";
	private static final long serialVersionUID = 1L;
	private String customerFirstName;
	private String customerLastName;
	private long customerId;
	private String IBAN;
	private float balance;
	private String accountCurrency;
	
	
	
	
	public AccountDTO(Account account, Customer customer) {
		super();
		this.customerFirstName = customer.getFirstname();
		this.customerLastName = customer.getLastname();
		this.customerId = customer.getCustomerId();
		this.IBAN = account.getIBAN();
		this.balance = account.getBalance();
		this.accountCurrency = account.getAccountCurrency();
	}
	
	public String getCustomerName() {
		return customerFirstName;
	}
	public void setCustomerName(String customerName) {
		this.customerFirstName = customerName;
	}
	public String getCustomerLastName() {
		return customerLastName;
	}
	public void setCustomerLastName(String customerLastName) {
		this.customerLastName = customerLastName;
	}
	public long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}
	public String getIBAN() {
		return IBAN;
	}
	public void setIBAN(String iBAN) {
		IBAN = iBAN;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	public String getCustomerFirstName() {
		return customerFirstName;
	}
	public void setCustomerFirstName(String customerFirstName) {
		this.customerFirstName = customerFirstName;
	}
	public String getAccountCurrency() {
		return accountCurrency;
	}
	public void setAccountCurrency(String accountCurrency) {
		this.accountCurrency = accountCurrency;
	}

	@Override
	public String toString() {
		return "AccountDTO [customerFirstName=" + customerFirstName + ", customerLastName=" + customerLastName
				+ ", customerId=" + customerId + ", IBAN=" + IBAN + ", balance=" + balance + ", accountCurrency="
				+ accountCurrency + "]";
	}

	
	
	
	
	
	
}
