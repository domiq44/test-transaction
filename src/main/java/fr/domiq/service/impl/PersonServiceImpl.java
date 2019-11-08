package fr.domiq.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.domiq.entity.Person;
import fr.domiq.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService {

	@Override
	@Transactional
	public void manage(final Person person) {
		// ...
		create(person);
		// ...
	}

	@Override
	@Transactional
	public void create(final Person person) {
		throw new UnsupportedOperationException();
	}
	
	@Override
	@Transactional
	public void modify(final Person person) {
		throw new UnsupportedOperationException();
	}

	@Override
	@Transactional(readOnly = true)
	public Person findById(final long id) {
		throw new UnsupportedOperationException();
	}

	@Override
	@Transactional(readOnly = true)
	public List<Person> findAll() {
		throw new UnsupportedOperationException();
	}
}
