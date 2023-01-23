package com.vasavi.app.controller;


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
    public Patient savePatient(@RequestParam Patient patient){

        System.out.println(name);
        System.out.println(patient);
        return patient;
    }

    @PutMapping("/patient/update")
    public Patient updatePatient(@RequestBody Patient patient, String disease)
    {
       return patientService.updateDetail(patient,disease);

    }
    

}
