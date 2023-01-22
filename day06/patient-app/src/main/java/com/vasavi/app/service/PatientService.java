package com.vasavi.app.service;

import com.vasavi.app.model.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
public class PatientService {
    @Autowired
    PatientService patientService;

    @PutMapping("/patient/update")
    public Patient updateDetail(Patient patient, @RequestParam("disease") String disease){
       patient.setDisease(disease);
       return patient;
    }


}
