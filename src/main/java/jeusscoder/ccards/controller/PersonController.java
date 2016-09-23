package jeusscoder.ccards.controller;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import jeusscoder.ccards.entity.Person;
import jeusscoder.ccards.service.PersonServ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/ccard")
public class PersonController {
	@Autowired
	private PersonServ personServ;
	
	/*@RequestMapping(value="/create/{name}/{card}", method=RequestMethod.GET)
	public Person createWithCard(@PathVariable("name") String name, @PathVariable("card") String number) {
        return null;
    }*/
	
	@RequestMapping(value = "/cards" ,method = RequestMethod.GET)
	public Person findPersonBy(){
		return personServ.findPersonBy();
		
	}
}
