package com.davisnake.apirest_app.person;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PersonService {

    private final PersonRepository personRepo;

    public void createPersona (Person persona){

        personRepo.save(persona);

    }

    public void updatePersona (Person persona){

        personRepo.save(persona);

    }

    public void deletePersona (Integer id){

        personRepo.deleteById(id);

    }

    public Optional<List<Person>> getAllPersona (){

        return Optional.ofNullable(personRepo.findAll());

    }

    public Optional<Person> getPersonaById (Integer id){

        return personRepo.findById(id);

    }

}

