package com.vasavi.app.controller;


import com.vasavi.app.model.Appointment;
import com.vasavi.app.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patient")
public class PatientController {
    @Autowired
    AppointmentRepository appointmentRepository;
    @RequestMapping(value ="/my-appointment", method = RequestMethod.GET)
    public List<Appointment> getMyAppointments(@RequestParam String patientName){
        return appointmentRepository.findByPatientName(patientName);
    }
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public Appointment saveAppointment(@RequestBody Appointment appointment){
        appointment = appointmentRepository.save(appointment);
        return appointment;
    }



}
