package com.rashmi.medicallab.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.rashmi.medicallab.Entity.Patient;

public interface PatientRepository extends MongoRepository <Patient, String>{
    Patient findByUsername (String username);
    
}
