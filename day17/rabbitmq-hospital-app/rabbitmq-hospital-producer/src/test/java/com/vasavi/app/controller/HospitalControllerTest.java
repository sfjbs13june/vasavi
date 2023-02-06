package com.vasavi.app.controller;

import com.vasavi.app.model.Hospital;
import com.vasavi.app.model.Patient;
import com.vasavi.app.service.RabbitmqSender;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doNothing;
public class HospitalControllerTest {

    @InjectMocks
    HospitalController hospitalController;

    @Mock
    RabbitmqSender rabbitMQSender;

    @Test
    public void producer1Test() {

        doNothing().when(rabbitMQSender).sendHospital(any(Hospital.class));
        Hospital hospital = new Hospital();
        Hospital result= hospitalController.postHospital(hospital);

    }
    @Test
    public void producer2Test() {

        doNothing().when(rabbitMQSender).sendPatient(any(Patient.class));
        Patient patient = new Patient();
        Patient result= hospitalController.postPatient(patient);

    }
}
