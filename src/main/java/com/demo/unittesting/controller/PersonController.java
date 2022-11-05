package com.demo.unittesting.controller;

import com.demo.unittesting.domain.Person;
import com.demo.unittesting.service.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

  @Autowired private IPersonService personService;

  @GetMapping
  public List<Person> getAllPerson() {
    return personService.getAllPerson();
  }

  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  public Person save(@RequestBody Person person) {
    return personService.save(person);
  }
}
