package fr.domiq.service;

import java.util.List;

import fr.domiq.entity.Person;

public interface PersonService {

	void manage(final Person person);

	void create(final Person person);

	void modify(final Person person);

	Person findById(final long id);

	List<Person> findAll();
}
