package com.vasavi.app.controller;

import com.vasavi.app.model.Appointment;
import com.vasavi.app.model.Prescription;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class PrescriptionController {
    private Map<String, Prescription> DoctorMap = new HashMap<String, Prescription>();
    Prescription prescription1 = new Prescription("111","111","headache","patient1","doc1");
    Prescription prescription2 = new Prescription("112", "112", "fever", "patient2", "doc2");
    Prescription prescription3 = new Prescription("113", "113", "cold", "patient3", "doc3");

    @GetMapping("/viewPrescription")
    public List<Appointment> getPresription(){
        List listPrescription = new ArrayList();
        Appointment appointment1 = new Appointment("1","patientA","docA","4-jan-2023");
        Appointment appointment2 = new Appointment("2","patientB","docB","22-jan-2023");
        Appointment appointment3 = new Appointment("3","patientC","docC","28-jan-2023");

        listPrescription.add(prescription1.getDescription());
        listPrescription.add(prescription2.getDescription());
        listPrescription.add(prescription3.getDescription());
        return listPrescription;
    }
    @PostMapping("/save/prescription")
    public Prescription savePrescription(@RequestBody Prescription prescription){

        DoctorMap.put(prescription.getPrescriptionId(),prescription);
        return prescription;
    }




}
