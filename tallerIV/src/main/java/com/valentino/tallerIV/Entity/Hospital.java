package com.valentino.tallerIV.Entity;

import jakarta.persistence.*;

import java.util.List;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Hospital {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String address;
    private String phone;

    @OneToMany(mappedBy = "hospital", cascade = CascadeType.ALL)
    private List<Department> departments;
}

