package com.demo.unittesting.repository;

import com.demo.unittesting.domain.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

@DataJpaTest
public class PersonRepositoryTest {

  @Autowired private PersonRepository personRepository;

  @Test
  public void find_all_person_successs() {
    List<Person> persons = personRepository.findAll();
    Assertions.assertEquals(3, persons.size());
  }
}
