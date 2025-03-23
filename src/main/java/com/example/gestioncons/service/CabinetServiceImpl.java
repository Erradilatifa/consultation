package com.example.gestioncons.service;

import com.example.gestioncons.entity.Consultation;
import com.example.gestioncons.entity.Patient;
import com.example.gestioncons.repository.ConsultationRepository;
import com.example.gestioncons.repository.PatientsRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class CabinetServiceImpl implements CabinetService {
    private final PatientsRepository patientsRepository;
    private ConsultationRepository consultationRepository;

    public CabinetServiceImpl(PatientsRepository patientsRepository, ConsultationRepository consultationRepository) {
        this.patientsRepository = patientsRepository;
        this.consultationRepository = consultationRepository;
    }


    @Override
    public void savePatient(Patient patient) {
        patientsRepository.save(patient);
        patientsRepository.save(patient);

    }

    @Override
    public List<Patient> getAllPatients() {
        return patientsRepository.findAll();
    }

    @Override
    public Patient getPatientByID(Long id) {

        return patientsRepository.findById(id).get();
    }





    @Override
    public void deletePatient(int patient) {

    }



    @Override
    public void deletePatient(Patient patient) {
        patientsRepository.delete(patient);

    }

    @Override
    public void deletePatientById(Long id) {
        patientsRepository.deleteById(id);

    }

    @Override
    public void addConsultation(Consultation consultation) {
        consultationRepository.save(consultation);

    }

    @Override
    public List<Consultation> getAllConsultations(){

        return consultationRepository.findAll();
    }

    @Override
    public Consultation getConsultationsById(Long id) {
        return consultationRepository.findById(id).orElse(null);
    }
    @Override
    public void updateConsultation(Consultation consultation) {
        consultationRepository.save(consultation);
    }


    @Override
    public void deleteConsultationById(Long id) {
        consultationRepository.deleteById(id);
    }


}

