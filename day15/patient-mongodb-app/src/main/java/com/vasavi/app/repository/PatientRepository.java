package com.vasavi.app.repository;

import com.vasavi.app.model.Patient;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PatientRepository extends MongoRepository<Patient, String> {

    public Patient findByName(String name);

    public Patient save(Patient patient);


}