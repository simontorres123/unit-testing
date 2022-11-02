package com.demo.unittesting.service;

import com.demo.unittesting.domain.Person;

import java.util.List;

public interface IPersonService {

  List<Person> getAllPerson();

  Person save(Person person);
}
