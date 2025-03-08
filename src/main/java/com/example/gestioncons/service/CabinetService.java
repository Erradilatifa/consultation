package com.example.gestioncons.service;

import com.example.gestioncons.entity.Consultation;
import com.example.gestioncons.entity.Patient;

import java.util.List;

public interface CabinetService {
    void savePatient(Patient patient);
    void saveConsultation(Consultation consultation);
    List<Patient> getAllPatients();
     Patient getPatientByID(Long id);
     Consultation getConsultationByID(Long idConsultation);
    void deletePatient(int patient);

    void deletePatient(Patient patient);

    void deletePatientById(Long id);

    void AddConcultation(Consultation consultation);
    List<Consultation> getAllConsultations();




}
