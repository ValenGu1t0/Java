package com.valentino.tallerIV.Entity;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.util.List;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Patient extends Person {

    private Integer age;
    private LocalDate accepted;

    @ElementCollection private List<String> prescriptions;
    @ElementCollection private List<String> allergies;
    @ElementCollection private List<String> specialRequirements;
}

