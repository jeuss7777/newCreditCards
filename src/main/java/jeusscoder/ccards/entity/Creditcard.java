package jeusscoder.ccards.entity;

//import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import static javax.persistence.CascadeType.ALL;
import static javax.persistence.FetchType.EAGER;

@Entity
@Table(name = "creditcard")
public class Creditcard {
		
	@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "creditCardId")
	private Long creditCardId;
	
	@Column(name = "creditCardNumber")
	private String creditCardNumber;
	
	@Column(name= "creditCardOwnerId")
	private Long creditCardOwnerId;
		
	
	@ManyToOne(optional=false)
	@JoinColumn(name="creditCardOwnerId",referencedColumnName="personId", insertable=false, updatable=false)
	private Person owner;
	
	//@OneToMany(cascade = {ALL}, fetch = EAGER, mappedBy = "creditcard")
	//private Set<Operation> operations = new HashSet<>();

	

	public String getNumber() {
		return creditCardNumber;
	}

	public Long getCreditCardId() {
		return creditCardId;
	}

	public void setCreditCardId(Long creditCardId) {
		this.creditCardId = creditCardId;
	}

	public Long getCreditCardOwnerId() {
		return creditCardOwnerId;
	}

	public void setCreditCardOwnerId(Long creditCardOwnerId) {
		this.creditCardOwnerId = creditCardOwnerId;
	}

	public void setNumber(String number) {
		this.creditCardNumber = number;
	}
	
	

	@Override
	public String toString() {
		return "Creditcard [creditCardId=" + creditCardId
				+ ", creditCardNumber=" + creditCardNumber
				+ ", creditCardOwnerId=" + creditCardOwnerId + "]";
	}

	public Person getOwner() {
		return owner;
	}

	public void setOwner(Person owner) {
		this.owner = owner;
	}

	//public Set<Operation> getOperations() {
	//	return operations;
	//}

	//public void setOperations(Set<Operation> operations) {
	//	this.operations = operations;
	//}

	/*@Override
	public String toString() {
		return "CreditCard [id=" + id + ", number=" + number + ", person="
				+ person + ", operations=" + operations + "]";
	}*/
	
	/*@Override
	public String toString() {
		return "CreditCard [id=" + cardId + ", number=" + cardNumber + ", person="
				+ person + "]";
	}*/
	
	
	
	/*public static Creditcard createCard(String number) {
		Creditcard creditcard = new Creditcard();
        creditcard.setNumber(number);
        return creditcard;
    }*/
	
	/*@Override
	public String toString() {
		return "CreditCard [id=" + creditCardOwnerId + ", number=" + creditCardNumber + ", cardOwnerId=" + creditCardOwnerId + "]";
	}*/
	
	
	
}
