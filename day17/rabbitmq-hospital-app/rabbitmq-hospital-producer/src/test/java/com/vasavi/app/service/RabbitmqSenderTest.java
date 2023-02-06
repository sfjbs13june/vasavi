package com.vasavi.app.service;
import com.vasavi.app.model.Hospital;
import com.vasavi.app.model.Patient;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.amqp.core.AmqpTemplate;

public class RabbitmqSenderTest {
    @InjectMocks
    RabbitmqSender rabbitMQSender;

    @Mock
    AmqpTemplate amqpTemplate;

    @Test
    public void sendHospitalTest() {
        Hospital hospital = new Hospital();
        rabbitMQSender.sendHospital(hospital);
    }

    @Test
    public void sendPatientTest() {
        Patient patient = new Patient();
        rabbitMQSender.sendPatient(patient);
    }
}
