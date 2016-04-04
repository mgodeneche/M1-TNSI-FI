package digester;

import java.util.Date;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import utils.DateAdapter;

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
	
	
	@XmlElement(required=true)
	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}
	public Date getTransactionDate() {
		return transactionDate;
	}
	@XmlElement(required=true)
    @XmlJavaTypeAdapter(DateAdapter.class)
	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}
	public String getType() {
		return type;
	}
	@XmlElement(required=true)
	public void setType(String type) {
		this.type = type;
	}
	public float getAmount() {
		return amount;
	}
	@XmlElement(required=true)
	public void setAmount(float amount) {
		this.amount = amount;
	}
	public String getCurrency() {
		return currency;
	}
	@XmlElement(required=true)
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public long getCustomerId() {
		return CustomerId;
	}
	@XmlElement(required=true)
	public void setCustomerId(long customerId) {
		CustomerId = customerId;
	}


	@Override
	public String toString() {
		return "Transaction [transactionId=" + transactionId + ", transactionDate=" + transactionDate + ", type=" + type
				+ ", amount=" + amount + ", currency=" + currency + ", CustomerId=" + CustomerId + "]";
	}
	
	
	
	
	
	
	
	

}
