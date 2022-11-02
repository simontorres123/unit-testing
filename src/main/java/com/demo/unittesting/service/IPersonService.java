package com.demo.unittesting.service;

import com.demo.unittesting.domain.Person;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IPersonService {

    public List<Person> getAllPerson();

    public Person save(Person person);
}
