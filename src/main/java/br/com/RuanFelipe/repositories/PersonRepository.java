package br.com.RuanFelipe.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.RuanFelipe.model.Person;


@Repository
public interface PersonRepository extends JpaRepository<Person, Long>{
	

}
