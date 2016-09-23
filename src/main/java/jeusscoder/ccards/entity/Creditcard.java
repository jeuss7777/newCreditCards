package jeusscoder.ccards.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import static javax.persistence.CascadeType.ALL;
import static javax.persistence.FetchType.EAGER;

@Entity
public class Creditcard {
	
	@Id
	@GeneratedValue
	private Long id;
	private String number;
	
	@ManyToOne(cascade ={ALL})
//	@JoinColumn(name="")
	private Person person;
	
	@OneToMany(cascade = {ALL}, fetch = EAGER, mappedBy = "creditcard")
	private Set<Operation> operations = new HashSet<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public Set<Operation> getOperations() {
		return operations;
	}

	public void setOperations(Set<Operation> operations) {
		this.operations = operations;
	}

	@Override
	public String toString() {
		return "CreditCard [id=" + id + ", number=" + number + ", person="
				+ person + ", operations=" + operations + "]";
	}
	
	public static Creditcard createCard(String number) {
		Creditcard creditcard = new Creditcard();
        creditcard.setNumber(number);
        return creditcard;
    }
	
}
