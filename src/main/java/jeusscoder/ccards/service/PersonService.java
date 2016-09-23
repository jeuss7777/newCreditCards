package jeusscoder.ccards.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jeusscoder.ccards.dao.PersonRepository;
import jeusscoder.ccards.dao.PersonRepositoryImpl;
import jeusscoder.ccards.entity.CreditCard;
import jeusscoder.ccards.entity.Person;

@Service
public class PersonService {

	@Autowired
	private PersonRepository personRepository;
	
	public void addCustomer(Person person){
		personRepository.save(person);
	}
	
	public void createNewCard (Person person, CreditCard card){
		//personRepository.
	}
	
	
	
}
