package com.demo.unittesting.service;

import com.demo.unittesting.domain.Person;
import com.demo.unittesting.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements IPersonService {

  @Autowired private PersonRepository personRepository;

  @Override
  public List<Person> getAllPerson() {
    return personRepository.findAll();
  }

  @Override
  public Person save(Person person) {
    return personRepository.save(person);
  }
}
