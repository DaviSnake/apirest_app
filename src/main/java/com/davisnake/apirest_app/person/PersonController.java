package com.davisnake.apirest_app.person;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/person")
public class PersonController {

    private final PersonService personService;
   
    @PostMapping
    public void createPersona(@RequestBody Person persona){

        personService.createPersona(persona);

    }

    @PutMapping
    public ResponseEntity<Void> updatePerson(@RequestBody Person persona) {
        
        personService.updatePersona(persona);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePerson(@PathVariable Integer id) {

        personService.deletePersona(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping()
    public ResponseEntity<Optional<List<Person>>> getAllPerson() {

        Optional<List<Person>> persons = personService.getAllPersona();

        return ResponseEntity.ok(persons);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Person>> getPersonById(@PathVariable Integer id) {

        Optional<Person> person = (Optional<Person>) personService.getPersonaById(id);
        return ResponseEntity.ok(person);
    }

}

