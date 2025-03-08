package com.example.gestioncons.entity;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Data


public class Patient {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 100,nullable = false)
   private String name;
    @Column(length = 60)
    private String prenom;
    @Column(length = 90)
    private String email;
    @Column(length = 20)
    private String phone;
    @OneToMany(mappedBy = "patient")
    private List<Consultation> Consultations;

    public Patient(Long id, String name, String prenom, String email, String phone) {
        this.id = id;
        this.name = name;
        this.prenom = prenom;
        this.email = email;
        this.phone = phone;

    }


    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Consultation> getConsultations() {
        return Consultations;
    }

    public void setConsultations(List<Consultation> consultations) {
        Consultations = consultations;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", prenom='" + prenom + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", Consultations=" + Consultations +
                '}';
    }

    public Patient(Long id, String name, String prenom, String email, String phone, List<Consultation> consultations) {
        this.id = id;
        this.name = name;
        this.prenom = prenom;
        this.email = email;
        this.phone = phone;
        Consultations = consultations;
    }

    public Patient() {
    }
}

