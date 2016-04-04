package digester;

import java.util.Date;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Transaction {
	
	private int transactionId;
	private Date transactionDate;
	private String type;
	private float amount;
	private String currency;
	private long CustomerId;
	
	
	
	public int getTransactionId() {
		return transactionId;
	}
	
	
	@XmlElement
	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}
	public Date getTransactionDate() {
		return transactionDate;
	}
	@XmlElement
	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}
	public String getType() {
		return type;
	}
	@XmlElement
	public void setType(String type) {
		this.type = type;
	}
	public float getAmount() {
		return amount;
	}
	@XmlElement
	public void setAmount(float amount) {
		this.amount = amount;
	}
	public String getCurrency() {
		return currency;
	}
	@XmlElement
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public long getCustomerId() {
		return CustomerId;
	}
	@XmlElement
	public void setCustomerId(long customerId) {
		CustomerId = customerId;
	}
	
	
	
	
	
	

}
