package digester;
import org.mongodb.morphia.annotations.*;

@Entity
public class Customer {

	private String firstname;
	private String lastname;
	@Id private long customerId;
	@Embedded private Account account;
	
	
	
	public Customer(String firstname, String lastname, long customerId, Account account) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.customerId = customerId;
		this.account = account;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	@Override
	public String toString() {
		return "Customer [firstname=" + firstname + ", lastname=" + lastname + ", customerId=" + customerId
				+ ", account=" + account + "]";
	}
	
	
	
	
	
}
