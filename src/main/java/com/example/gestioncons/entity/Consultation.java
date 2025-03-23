package com.example.gestioncons.entity;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor



public class Consultation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idConsultation;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dateConsultation;
    private String description;
    @ManyToOne
    @JoinColumn(name = "id")
    private Patient patient;

    // Getters et setters
    public Long getIdConsultation() {
        return idConsultation;
    }

    public void setIdConsultation(Long idConsultation) {
        this.idConsultation = idConsultation;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDateConsultation() {
        return dateConsultation;
    }

    public void setDateConsultation(LocalDate dateConsultation) {
        this.dateConsultation = dateConsultation;
    }






}
