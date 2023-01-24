package com.vasavi.app.controller;


import com.vasavi.app.exception.*;
import com.vasavi.app.model.Patient;
import com.vasavi.app.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
public class PatientController {

    @Value("${app.name}")
    String name;
    @Autowired
    PatientService patientService;
    @PostMapping("/patient/save")
    public Patient savePatient(@RequestParam Patient patient) throws PatientIdNotFoundException, PatientNameNotFoundException, PatientAgeNotFoundException,
            PatientGenderNotFoundException, PatientDiseaseNotFoundException {
        if(patient.getId()==null){
            throw new PatientIdNotFoundException("No Patient Found with given ID");
        }
        if(patient.getName()==null){
            throw new PatientNameNotFoundException("No Patient Found with given name");
        }
        if(patient.getAge()==null){
            throw new PatientAgeNotFoundException("No Patient Found with given age");
        }
        if(patient.getGender()==null){
            throw new PatientGenderNotFoundException("No Patient Found with given gender");
        }
        if(patient.getDisease()==null){
            throw new PatientDiseaseNotFoundException("No Patient Found with given disease");
        }

        System.out.println(patient);
        return patient;


    }
    

}
