package com.rashmi.medicallab.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.rashmi.medicallab.Entity.Doctor;


@Repository
public interface DoctorRepository extends MongoRepository<Doctor,String>{
Doctor findByUsername(String username);
    
}
