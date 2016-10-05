package jeusscoder.ccards.entity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import static javax.persistence.CascadeType.ALL;
import static javax.persistence.FetchType.EAGER;

@Entity
@Table(name = "person")
public class Person {

	@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "personId")
	private Long personId;
	
	@Column(name = "personName")
	private String personName;
	
	
	//@OneToMany(mappedBy="owner",targetEntity=Creditcard.class,fetch=FetchType.EAGER, cascade=CascadeType.PERSIST)
	@OneToMany(mappedBy="owner",targetEntity=Creditcard.class,fetch=FetchType.EAGER)
	private List<Creditcard> creditcards;
	
	//private Set<Creditcard> creditcards = new HashSet<>();
	
	//@OneToMany(cascade = {ALL}, fetch= EAGER, mappedBy = "person")
	//@OneToMany	
	//private Set<Creditcard> creditcards = new HashSet<>();
	
	
	public Long getId() {
		return personId;
	}

	public void setId(Long id) {
		this.personId = id;
	}

	public String getName() {
		return personName;
	}

	public void setName(String name) {
		this.personName = name;
	}

	/*@Override
	public String toString() {
		return "Person [personId=" + personId + ", personName=" + personName
				+ "]";
	}*/

	/*public Collection<Creditcard> getCreditcards() {
		return creditcards;
	}

	public void setCreditcards(Set<Creditcard> creditcards) {
		this.creditcards = creditcards;
	}*/



	
	/*public static Person createPerson(String name, Collection<Creditcard> cards){
		Person person = new Person();
		person.setName(name);
		
		for (Creditcard card : cards) {
			card.setPerson(person);
			person.getCreditcards().add(card);
		}
		return person;
	}*/
	
	public void addCreditCard(Creditcard creditCard){
		if (creditcards ==null){
			creditcards = new ArrayList<Creditcard>();			
		}
		if (!creditcards.contains(creditCard)){
			creditcards.add(creditCard);
		}
	}
	
	

	public List<Creditcard> getCreditcards() {
		return creditcards;
	}

	public void setCreditcards(List<Creditcard> creditcards) {
		this.creditcards = creditcards;
	}

	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personName=" + personName
				+ ", creditcards=" + creditcards + "]";
	}
	
	
	
}
