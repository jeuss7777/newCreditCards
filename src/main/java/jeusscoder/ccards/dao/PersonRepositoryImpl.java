package jeusscoder.ccards.dao;

import static jeusscoder.ccards.entity.CreditCard.createCard;
import static jeusscoder.ccards.entity.Person.createPerson;

import java.util.Arrays;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;

import jeusscoder.ccards.entity.CreditCard;
import jeusscoder.ccards.dao.PersonRepositoryCustom;

import jeusscoder.ccards.entity.Person;

@Transactional
public class PersonRepositoryImpl implements PersonRepositoryCustom {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Person createWithCard(String name, String number) {
        CreditCard creditCard = createCard(number);
        Person person = createPerson(name, Arrays.asList(creditCard));
        entityManager.persist(person);
        return person;
    }
}