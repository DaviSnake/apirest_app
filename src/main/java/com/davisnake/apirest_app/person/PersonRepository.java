package com.davisnake.apirest_app.person;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PersonRepository extends JpaRepository <Person, Integer> {
    
}
