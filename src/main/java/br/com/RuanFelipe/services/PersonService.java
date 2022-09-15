package br.com.RuanFelipe.services;

import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

import org.springframework.stereotype.Service;

import br.com.RuanFelipe.model.Person;

@Service
public class PersonService {
	
	
	private final AtomicLong counter = new AtomicLong();
	private Logger logger = Logger.getLogger(PersonService.class.getName());
	
	public Person findById(String id) {
		logger.info("finding one person!");
		Person person = new Person();
		person.setId(counter.incrementAndGet());
		person.setFirstName("Ruan");
		person.setLastName("Silva");
		person.setAddress("Benevides-Pa");
		person.setGender("Male");
		return person;
	}
}
