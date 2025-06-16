package com.davisnake.apirest_app.person;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@Data
@NoArgsConstructor
public class Person {
    @Id
    @GeneratedValue
    private Integer id;
    @Basic
    private String firstName;
    private String lastName;
    private String email;

}
