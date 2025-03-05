package com.example.gestioncons.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor


public class Consultation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idConsultation;
    private Date dateConsultation;
    private String description;
    @ManyToOne
    private Patient patient;


    public Consultation(int id, String description, Date dateConsultation, Patient patient ) {
        super();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getIdConsultation() {
        return idConsultation;
    }

    public void setIdConsultation(long idConsultation) {
        this.idConsultation = idConsultation;
    }

    public Date getDateConsultation() {
        return dateConsultation;
    }

    public void setDateConsultation(Date dateConsultation) {
        this.dateConsultation = dateConsultation;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    @Override
    public String toString() {
        return "Consultation{" +
                "idConsultation=" + idConsultation +
                ", dateConsultation=" + dateConsultation +
                ", description='" + description + '\'' +
                ", patient=" + patient +
                '}';
    }

    public Consultation(long idConsultation, Date dateConsultation, String description, Patient patient) {
        this.idConsultation = idConsultation;
        this.dateConsultation = dateConsultation;
        this.description = description;
        this.patient = patient;
    }

    public Consultation() {
    }
}
