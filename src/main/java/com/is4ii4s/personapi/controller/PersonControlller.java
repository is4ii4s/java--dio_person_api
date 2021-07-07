package com.is4ii4s.personapi.controller;

import com.is4ii4s.personapi.dto.MessageResponseDTO;
import com.is4ii4s.personapi.dto.request.PersonDTO;
import com.is4ii4s.personapi.entity.Person;
import com.is4ii4s.personapi.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1/people")
public class PersonControlller {

    private PersonService personService;

    @Autowired
    public PersonControlller(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MessageResponseDTO createPerson(@RequestBody @Valid PersonDTO personDTO) {
        return personService.createPerson(personDTO);
    }

    @GetMapping
    public List<PersonDTO> listAll() {
        return personService.listAll();
    }


}
