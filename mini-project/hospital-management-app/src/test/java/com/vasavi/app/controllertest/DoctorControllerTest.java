package com.vasavi.app.controllertest;

import com.vasavi.app.controller.DoctorController;
import com.vasavi.app.model.Appointment;
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
public class DoctorControllerTest {


    @InjectMocks
    private DoctorController doctorController;
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
   public void Test1(){
        List<Appointment> appointment = new ArrayList();
        Appointment appointment1 = new Appointment();
        appointment1.setAppointmentId("1");
        appointment1.setDoctorName("max");
        appointment1.setDate("20 march");
        appointment1.setPatientName("justin");
        appointment.add(appointment1);
        when(appointmentRepository.findByDoctorName(anyString())).thenReturn(appointment);
        List<Appointment> result=doctorController.getAppointments("max");

        assertEquals(appointment.size(),1);
        assertEquals(appointment.get(0).getAppointmentId(),result.get(0).getAppointmentId());
        assertEquals(appointment.get(0).getDoctorName(),result.get(0).getDoctorName());
        assertEquals(appointment.get(0).getPatientName(),result.get(0).getPatientName());
        assertEquals(appointment.get(0).getDate(),result.get(0).getDate());




    }

    @Test
    public void Test2(){
        Appointment saveAppointment=new Appointment();
        saveAppointment.setAppointmentId("12");
        saveAppointment.setDate("1 dec");
        saveAppointment.setDoctorName("arun");
        saveAppointment.setPatientName("john");
        when(appointmentRepository.save(any(Appointment.class))).thenReturn(saveAppointment);
        Appointment result = doctorController.saveAppointment(appointment);
        assertEquals(saveAppointment.getAppointmentId(), result.getAppointmentId());
        assertEquals(saveAppointment.getDate(), result.getDate());
        assertEquals(saveAppointment.getDoctorName(),result.getDoctorName());
        assertEquals(saveAppointment.getPatientName(), result.getPatientName());
    }

}



