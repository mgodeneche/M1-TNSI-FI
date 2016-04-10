package digester;

public class Account {
	
	private String  IBAN;
	private float balance;
	private String accountCurrency;


	
	public Account(String iBAN, float balance, String accountCurrency) {
		super();
		IBAN = iBAN;
		this.balance = balance;
		this.accountCurrency = accountCurrency;
	}

	public Float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public String getAccountCurrency() {
		return accountCurrency;
	}

	public void setAccountCurrency(String accountCurrency) {
		this.accountCurrency = accountCurrency;
	}

	public String getIBAN() {
		return IBAN;
	}

	public void setIBAN(String iBAN) {
		IBAN = iBAN;
	}

	@Override
	public String toString() {
		return "Account [IBAN=" + IBAN + ", balance=" + balance + ", accountCurrency=" + accountCurrency + "]";
	}
	
	
	
	
	
	
	
}
