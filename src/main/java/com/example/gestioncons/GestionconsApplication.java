package com.example.gestioncons;

import com.example.gestioncons.entity.Consultation;
import com.example.gestioncons.entity.Patient;
import com.example.gestioncons.repository.ConsultationRepository;
import com.example.gestioncons.repository.PatientsRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Date;
import java.time.LocalDate;
import java.time.Month;

@SpringBootApplication
public class GestionconsApplication implements CommandLineRunner {


    PatientsRepository patientsRepository;
    ConsultationRepository consultationRepository;

    public GestionconsApplication(PatientsRepository patientsRepository, ConsultationRepository consultationRepository) {
        this.patientsRepository = patientsRepository;
        this.consultationRepository = consultationRepository;
    }

    public static void main(String[] args) {

        SpringApplication.run(GestionconsApplication.class, args);
    }



    public void run(String... args) throws Exception {
/*
       Patient patient = new Patient();

        patient.setName("Erradi");
        patient.setPrenom("Latifa");
        patient.setEmail("erradilatifa@gmail.com)");
        patient.setPhone("096677736");

        patientsRepository.save(patient);*/
      /* Patient patient=patientsRepository.findById(2L).get();*/
        /* patient.setName("mb");
        patient.setPrenom("rihame");
        patient.setPhone("086666666");
        patientsRepository.save(patient);*/

        /*Consultation consultation=new Consultation();
        consultation.setDateConsultation(Date.valueOf(LocalDate.of(2023,Month.AUGUST,27)));
        consultation.setDescription("consultation 1" );
        consultation.setPatient(patient);
        consultationRepository.save(consultation);*/




    }
}
