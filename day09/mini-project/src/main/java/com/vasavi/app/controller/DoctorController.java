package com.vasavi.app.controller;

import com.vasavi.app.model.Appointment;
import com.vasavi.app.model.Prescription;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class DoctorController {

   private Map<String,Appointment> DoctorMap = new HashMap<String,Appointment>();

   Prescription prescription1 = new Prescription("111","111","headache","patient1","doc1");
    Prescription prescription2 = new Prescription("112", "112", "fever", "patient2", "doc2");
    Prescription prescription3 = new Prescription("113", "113", "cold", "patient3", "doc3");

    @RequestMapping("/doctor")
   public Map<String,Appointment> RequestDoctor(){


        Appointment appointment1 = new Appointment("1","patientA","docA","4-jan-2023");
        Appointment appointment2 = new Appointment("2","patientB","docB","22-jan-2023");
        Appointment appointment3 = new Appointment("3","patientC","docC","28-jan-2023");

        DoctorMap.put(appointment1.getAppointmentId(),appointment1);
        DoctorMap.put(appointment2.getAppointmentId(),appointment2);
        DoctorMap.put(appointment3.getAppointmentId(),appointment3);

        return DoctorMap;
    }
    @GetMapping("/doctor-appointment")
    public List<Appointment> getDoctors(){
        List listDoctors = new ArrayList();
        Appointment appointment1 = new Appointment("111","patientA","docA","4-jan-2023");
        Appointment appointment2 = new Appointment("2","patientB","docB","22-jan-2023");
        Appointment appointment3 = new Appointment("3","patientC","docC","28-jan-2023");

        listDoctors.add(appointment1);
        listDoctors.add(appointment2);
        listDoctors.add(appointment3);
        System.out.println(listDoctors);
        return listDoctors;

    }


    @PostMapping("/save")
    public Appointment saveAppointment(@RequestBody Appointment appointment){
        System.out.println(appointment);
        return appointment;
    }
}
