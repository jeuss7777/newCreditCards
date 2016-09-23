package jeusscoder.ccards.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import static javax.persistence.CascadeType.ALL;

@Entity
public class Operation {
	
	@Id
	@GeneratedValue
	private Long id;
	private BigDecimal amount;
	
	@ManyToOne(cascade ={ALL})
	private CreditCard creditcard;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public CreditCard getCreditcard() {
		return creditcard;
	}

	public void setCreditcard(CreditCard creditcard) {
		this.creditcard = creditcard;
	}

	@Override
	public String toString() {
		return "Operation [id=" + id + ", amount=" + amount + ", creditcard="
				+ creditcard + "]";
	}
	
	
}
