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
public class Staff extends Person {

    private LocalDate joined;

    @ElementCollection private List<String> education;
    @ElementCollection private List<String> certification;
    @ElementCollection private List<String> languages;
}

