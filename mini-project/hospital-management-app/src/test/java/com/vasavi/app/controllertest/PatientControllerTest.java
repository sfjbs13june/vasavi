package com.vasavi.app.controllertest;


import com.vasavi.app.controller.PatientController;
import com.vasavi.app.model.Appointment;
import com.vasavi.app.model.Prescription;
import com.vasavi.app.repository.AppointmentRepository;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

    @RunWith(MockitoJUnitRunner.class)
    public class PatientControllerTest {

        @InjectMocks
        private PatientController patientController;
        @Mock
        Appointment appointment;
        @Mock
        AppointmentRepository appointmentRepository;
        @BeforeEach
        void setUp(){
            appointment= Mockito.mock(Appointment.class);
            appointmentRepository=Mockito.mock(AppointmentRepository.class);
        }

        @Test
        public void TestGetAppointments(){
            List<Appointment> getMyAppointment = new ArrayList();
            Prescription prescription1 = new Prescription("33","21","fever","olivia","charle");
            Appointment appointmentPatient = new Appointment("34","jongil","harry","14 feb",prescription1);
            getMyAppointment.add(appointmentPatient);
            when(appointmentRepository.findByPatientName(anyString())).thenReturn(getMyAppointment);
            List<Appointment> result = patientController.getMyAppointments("olivia");
            assertEquals(getMyAppointment.size(), 1);
            assertEquals(getMyAppointment.size(), 1);
            assertEquals(getMyAppointment.get(0).getAppointmentId(),result.get(0).getAppointmentId());
            assertEquals(getMyAppointment.get(0).getDate(),result.get(0).getDate());
            assertEquals(getMyAppointment.get(0).getPatientName(),result.get(0).getPatientName());
            assertEquals(getMyAppointment.get(0).getDoctorName(),result.get(0).getDoctorName());
            assertEquals(getMyAppointment.get(0).getPrescription().getDescription(),result.get(0).getPrescription().getDescription());
        }


        @Test
        public void TestSaveAppointments(){

            Appointment savePatientAppointment=new Appointment();
            savePatientAppointment.setAppointmentId("22");
            savePatientAppointment.setDate("13 feb");
            savePatientAppointment.setDoctorName("puthin");
            savePatientAppointment.setPatientName("kim");
            when(appointmentRepository.save(any(Appointment.class))).thenReturn(savePatientAppointment);
            Appointment result = patientController.saveAppointment(appointment);
            assertEquals(savePatientAppointment.getAppointmentId(), result.getAppointmentId());
            assertEquals(savePatientAppointment.getDate(), result.getDate());
            assertEquals(savePatientAppointment.getDoctorName(),result.getDoctorName());
            assertEquals(savePatientAppointment.getPatientName(), result.getPatientName());

        }

    }

