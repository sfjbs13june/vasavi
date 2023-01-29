package com.vasavi.app.controller;

import com.vasavi.app.model.Prescription;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class PrescriptionController {


    @GetMapping("/view/prescription")
    public Map getAllPrescriptions() {
        Map PrescriptionMap = new HashMap();


        Prescription prescription1 = new Prescription("111", "111", "headache", "patient1", "doc1");
        Prescription prescription2 = new Prescription("112", "112", "fever", "patient2", "doc2");
        Prescription prescription3 = new Prescription("113", "113", "cold", "patient3", "doc3");

        Prescription.put(prescription1.getAppointmentId(),prescription1);
        Prescription.put(prescription2.getAppointmentId(),prescription2);
        Prescription.put(prescription3.getAppointmentId(),prescription3);

        return PrescriptionMap;

    }


}
