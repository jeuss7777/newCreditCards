package jeusscoder.ccards.controller;

import static jeusscoder.ccards.entity.CreditCard.createCard;
import static jeusscoder.ccards.entity.Person.createPerson;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import jeusscoder.ccards.entity.CreditCard;
import jeusscoder.ccards.entity.Person;
import jeusscoder.ccards.service.PersonService;

@RestController
@RequestMapping(value="/ccard")
public class PersonController {
	@Autowired
	private PersonService personService;
	
	@RequestMapping(value="/create/{name}/{card}", method=RequestMethod.GET)
	public Person createWithCard(@PathVariable("name") String name, @PathVariable("card") String number) {
        return null;
    }
}
