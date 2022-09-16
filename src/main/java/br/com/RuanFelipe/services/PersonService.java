package br.com.RuanFelipe.services;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.RuanFelipe.exceptions.ResourceNotFoundException;
import br.com.RuanFelipe.model.Person;
import br.com.RuanFelipe.repositories.PersonRepository;

@Service
public class PersonService {
	
	@Autowired
	PersonRepository repository;
	
	private Logger logger = Logger.getLogger(PersonService.class.getName());
	
	
	
	
	
	public List<Person> findAll(){

		logger.info("finding all people!");
		return repository.findAll();
	}

	public Person findById(Long id) {
		logger.info("finding one person!");

		return repository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("no records found for this ID!"));
	}
	
	public Person create(Person person) {
		logger.info("Creating one person!");
		return repository.save(person);
	}
	public Person update(Person person) {
		logger.info("Updating one person!");
		Person entity = repository.findById(person.getId())
		.orElseThrow(() -> new ResourceNotFoundException("no records found for this ID!"));
		
		entity.setFirstName(person.getFirstName());
		entity.setLastName(person.getLastName());
		entity.setAddress(person.getAddress());
		entity.setGender(person.getGender());
				
		return repository.save(entity);
	}
	public void delete(Long id) {
		logger.info("deleting one person!");
		Person entity = repository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("no records found for this ID!"));
		repository.delete(entity);
		
	}
	
}
