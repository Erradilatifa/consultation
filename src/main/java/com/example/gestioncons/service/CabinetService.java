package com.example.gestioncons.service;

import com.example.gestioncons.entity.Consultation;
import com.example.gestioncons.entity.Patient;

import java.util.List;

public interface CabinetService {
    void savePatient(Patient patient);
    List<Patient> getAllPatients();
     Patient getPatientByID(Long id);

    void deletePatient(int patient);

    void deletePatient(Patient patient);

    void deletePatientById(Long id);

    void AddConcultation(Consultation consultation);
    List<Consultation> getAllConsultations();



}
