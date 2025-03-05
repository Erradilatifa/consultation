package com.example.gestioncons.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.gestioncons.entity.Patient;
import org.springframework.stereotype.Repository;

@Repository

public interface PatientsRepository extends JpaRepository<Patient, Long> {

}
