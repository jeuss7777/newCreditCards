package jeusscoder.ccards.entity;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import static javax.persistence.CascadeType.ALL;
import static javax.persistence.FetchType.EAGER;

@Entity
public class Person {

	@Id
	@GeneratedValue
	private Long id;
	private String name;
	
	@OneToMany(cascade = {ALL}, fetch= EAGER, mappedBy = "person")
	private Set<CreditCard> creditcards = new HashSet<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<CreditCard> getCreditcards() {
		return creditcards;
	}

	public void setCreditcards(Set<CreditCard> creditcards) {
		this.creditcards = creditcards;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", creditcards="
				+ creditcards + "]";
	}

	
	public static Person createPerson(String name, Collection<CreditCard> cards){
		Person person = new Person();
		person.setName(name);
		
		for (CreditCard card : cards) {
			card.setPerson(person);
			person.getCreditcards().add(card);
		}
		return person;
	}
	
	
	
}