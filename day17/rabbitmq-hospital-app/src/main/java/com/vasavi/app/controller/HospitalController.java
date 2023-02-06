package com.vasavi.app.controller;

import main.java.com.vasavi.app.model.Hospital;
import main.java.com.vasavi.app.model.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


    @RestController
    @RequestMapping(value = "/rabbitmq/")
    public class HospitalController{
        @Autowired
        RabbitmqSender rabbitmqSender;

        @PostMapping(value = "/hospital")
        public Hospital postHospital(@RequestBody Hospital){
            rabbitMQSender.sendHospital(hospital);
            System.out.println("Message sent to the RabbitMQ Successfully");
            return hospital;
    }
        @PostMapping(value = "/patient")
        public Patient postPatient(@RequestBody Patient patient) {

            rabbitMQSender.sendPatient(patient);
            System.out.println("Message sent to the RabbitMQ Successfully");
            return patient;
        }
}
