package com.valentino.tallerIV.Entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Person {

    @Id
    @GeneratedValue
    private Long id;
    protected String title;
    protected String firstName;
    protected String lastName;
    protected LocalDate birthDate;
    protected String gender;
    protected String homeAddress;
    protected String phone;

}
