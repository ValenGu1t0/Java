package com.valentino.tallerIV.Repository;

import com.valentino.tallerIV.Entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}

