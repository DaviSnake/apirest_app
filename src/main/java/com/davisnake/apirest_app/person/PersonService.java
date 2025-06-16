package com.davisnake.apirest_app.person;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PersonService {

    private final PersonRepository personRepo;

    public void createPersona (Person persona){

        personRepo.save(persona);

    }

}

