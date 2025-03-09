package com.example.gestioncons.web;
import com.example.gestioncons.entity.Consultation;
import com.example.gestioncons.entity.Patient;
import com.example.gestioncons.service.CabinetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@Controller

public class CabinetController {
    private CabinetService cabinetService;


    public CabinetController(CabinetService cabinetService) {
        this.cabinetService = cabinetService;
    }
    @GetMapping("/patients")
    public String getPatients(Model model) {
        List<Patient> patients=cabinetService.getAllPatients();
        model.addAttribute("patients", patients);
        return "patients";

    }
    @GetMapping("/patients/new")
    public String newPatient(Model model) {
        model.addAttribute("patient", new Patient());
        return "add_Patient";
    }
    @PostMapping("/patients")
    public String savePatient(@ModelAttribute Patient patient) {
        cabinetService.savePatient(patient);
        return "redirect:/patients";

    }
    @GetMapping("/deletePatient")
    public String deletePatient(@RequestParam("id") Long id) {
        cabinetService.deletePatientById( id);

        return "redirect:/patients/";


    }
    @GetMapping("/patients/edit/{id}")
    public String editPatient(@PathVariable("id") Long id, Model model) {
        Patient patient=cabinetService.getPatientByID(id);
        model.addAttribute("patient", patient);
        return "edit_Patient";


    }
    @GetMapping("/consultations")
    public String getConsultation(Model model) {
        List<Consultation> consultation=cabinetService.getAllConsultations();
        model.addAttribute("consultations",consultation);
        return "consultations";
    }

    @GetMapping("/consultations/new")
    public String newConsultation(Model model) {
        Consultation consultation = new Consultation();
        List<Patient> patients = cabinetService.getAllPatients();
        model.addAttribute("consultation", consultation);
        model.addAttribute("patients", patients);
        return "add_consultation";
    }



    @PostMapping("/consultations")
    public String saveConsultation(@ModelAttribute("consultaion") Consultation consultation, BindingResult result) {
        if (result.hasErrors()) {
            return "redirect:/consultations";
        }
        cabinetService.saveConsultation(consultation);
        return "redirect:/consultations/new";
    }





}
