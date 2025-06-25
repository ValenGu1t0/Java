package com.valentino.tallerIV.Repository;

import com.valentino.tallerIV.Entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {
}

