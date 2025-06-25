package com.valentino.tallerIV.Entity;

import jakarta.persistence.*;

import java.util.List;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Department {
    @Id
    @GeneratedValue
    private Long id;
    private String name;

    @ManyToOne
    @JoinColumn(name = "hospital_id")
    private Hospital hospital;

    @ManyToMany
    private List<Patient> patients;

    @ManyToMany
    private List<Staff> staff;
}

