package com.vasavi.app.controller;

import com.vasavi.app.service.RabbitmqSender;
import com.vasavi.app.model.Hospital;
import com.vasavi.app.model.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/rabbitmq/")
public class HospitalController {
    @Autowired
    RabbitmqSender rabbitmqSender;
    private Hospital hospital;

    @PostMapping(value = "/hospital")
    public Hospital postHospital(@RequestBody Hospital hospital){
        rabbitmqSender.sendHospital(hospital);
        System.out.println("Message sent to the RabbitMQ Successfully");
        return hospital;
}
    @PostMapping(value = "/patient")
    public Patient postPatient(@RequestBody Patient patient) {

        rabbitmqSender.sendPatient(patient);
        System.out.println("Message sent to the RabbitMQ Successfully");
        return patient;
    }
}
