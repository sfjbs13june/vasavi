package com.vasavi.app.repository;

import com.vasavi.app.model.Appointment;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Repository
public interface AppointmentRepository extends MongoRepository<Appointment, String>{
    public List<Appointment> findByDoctorName(String doctorName);
    public Appointment save(Appointment appointment);
    public List<Appointment> findByPatientName(String patientName);

}
