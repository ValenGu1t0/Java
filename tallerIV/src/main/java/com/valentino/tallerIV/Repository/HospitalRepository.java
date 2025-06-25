package com.valentino.tallerIV.Repository;

import com.valentino.tallerIV.Entity.Hospital;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HospitalRepository extends JpaRepository<Hospital, Long> {
}

